package Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class SeqWordCounter {
  private String text;
    FileReader file;
    BufferedReader buffer;
    
    int lines, words, coincidences;

    public SeqWordCounter(String file, String pattern) {
      lines = 0;
      words = 0;
      coincidences =0;
      try {
          this.file = new FileReader(file);
          this.buffer = new BufferedReader(this.file);
          while((text = buffer.readLine()) != null){
              checkLine(text, pattern);
          }
          buffer.close();
      } 
      catch(FileNotFoundException ex) {
          System.out.println(ex);
      }
      catch(IOException ex){}
  }
  
  public void checkLine(String text, String pattern) {
      for (int i = 0; i < text.length(); i++) {
          if(text.charAt(i)==' ')
              words++;
              
              if(pattern.length() + i < text.length())
                  if(text.substring(i, pattern.length() + i).equals(pattern))
                      coincidences++;
      }
      
      text = text.replaceAll("(\n|\r| )", "");
       if (!(Pattern.matches("^[a-zA-Z]", text))) {          
          lines++;
      }
  }
  
  public int getWords() {
      return this.words;
  }
  
  public int getLines() {
      return this.lines;
  }
  
  public int getCoincidences() {
      return this.coincidences;
  }
}
