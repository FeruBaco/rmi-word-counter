package Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.regex.Pattern;

public class ConWordCounter extends Thread {
  private String text;
  private FileReader file;
  private BufferedReader buffer;
  ForkJoinPool f = new ForkJoinPool();
  
  private int lines, words, coincidences;
  
  public ConWordCounter(String files, String pattern) {
      lines =0;
      words=0;
      coincidences = 0;
      
      try{
          file = new FileReader(files);
          buffer = new BufferedReader(file);
          
          while((text = buffer.readLine()) != null){
              CheckLine check = new CheckLine(text, pattern);
              f.invoke(check);
          }
          buffer.close();
      }
      catch (FileNotFoundException ex) {}
      catch (IOException ex) {}
  }
  
   private class CheckLine extends RecursiveAction{
      String line, pattern;
      
      public CheckLine(String line, String pattern){
          this.line = line;
          this.pattern = pattern;
      }
      
      @Override
      protected void compute(){
          for (int i = 0; i < line.length(); i++) {
              if(line.charAt(i) == ' ')
                  words++;
              
              if(pattern.length() + i < line.length())
              if(line.substring(i, pattern.length() + i).equals(pattern))
                  coincidences++;
          }
          
          if (!(Pattern.matches("^[a-zA-Z]", line))) {
              lines++;
          }
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
