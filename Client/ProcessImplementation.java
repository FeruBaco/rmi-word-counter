package Client;

import java.rmi.RemoteException;

import javax.swing.JLabel;
import java.rmi.server.UnicastRemoteObject;

import Interface.ClientInterface;
import Interface.ServerInterface;

public class ProcessImplementation extends UnicastRemoteObject implements ClientInterface, Runnable{

  ServerInterface server;
  JLabel[] labels;
  String word;
  public String name = null;

  protected ProcessImplementation(String name, ServerInterface server, String word, JLabel[] labels) throws RemoteException {
    this.name = name;
    this.server = server;
    this.word = word;
    this.labels = labels;
    server.register(this);
  }

  @Override
  public void run() {
    try {
      server.message(this.word);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void clientMessage(String message, int[] seqData, int[]exeData, int[]conData) throws RemoteException {
    System.err.println(message);
    for(int i = 0; i < seqData.length; i++) {
      this.labels[i].setText(Integer.toString(seqData[i]));
    }
    int j = 4;
    for(int i = 0; i < exeData.length; i++) {
      this.labels[j].setText(Integer.toString(exeData[i]));
      j++;
    }
    j = 8;
    for(int i = 0; i < 4; i++) {
      this.labels[j].setText(Integer.toString(conData[i]));
      j++;
    }
  }
  
}
