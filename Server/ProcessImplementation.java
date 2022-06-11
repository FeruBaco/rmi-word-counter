package Server;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

import Interface.ClientInterface;
import Interface.ServerInterface;

public class ProcessImplementation extends UnicastRemoteObject implements ServerInterface{
  public ArrayList<ClientInterface> clients;

  public ProcessImplementation() throws RemoteException {
    clients = new ArrayList<ClientInterface>();
  }

  @Override
  public void register(ClientInterface client) throws RemoteException {
    System.out.println("Connected: " + client);
    this.clients.add(client); 
  }

  @Override
  public void message(String message) throws RemoteException {
    File dir =new File("ipsum.txt");
    String filePath = dir.getAbsolutePath();
    int a = 0;
    int[] seqData = SeqCounter(filePath, message);
    int[] exeData = ExeCounter(filePath, message);
    int[] conData = ConCounter(filePath, message);
    while (a < clients.size()) {
      clients.get(a++).clientMessage("Se busco: " + message, seqData, exeData, conData);
    }
  }

  public int[] SeqCounter(String file, String pattern) {
    Date initDate = new Date();
    SeqWordCounter wc = new SeqWordCounter(file, pattern);
    Date finalDate = new Date();
    long time =  finalDate.getTime() - initDate.getTime();
    System.out.println("Sequential - Words: " + wc.getWords() + " Lines: " + wc.getLines() + " Coincidences: " + wc.getCoincidences() + " Time: " + time);
    int[] res = new int[] {wc.getWords(), wc.getLines(), wc.getCoincidences(), (int)time };
    return res;
  }

  public int[] ExeCounter(String file, String pattern) {
    Date initDate = new Date();
    SeqWordCounter wc = new SeqWordCounter(file, pattern);
    Date finalDate = new Date();
    long time =  finalDate.getTime() - initDate.getTime();
    System.out.println("Executor - Words: " + wc.getWords() + " Lines: " + wc.getLines() + " Coincidences: " + wc.getCoincidences() + " Time: " + time);
    int[] res = new int[] {wc.getWords(), wc.getLines(), wc.getCoincidences(), (int)time };
    return res;
  }

  public int[] ConCounter(String file, String pattern) {
    Date initDate = new Date();
    ConWordCounter wc = new ConWordCounter(file, pattern);
    Date finalDate = new Date();
    long time =  finalDate.getTime() - initDate.getTime();
    System.out.println("ForkJoin - Words: " + wc.getWords() + " Lines: " + wc.getLines() + " Coincidences: " + wc.getCoincidences() + " Time: " + time);
    int[] res = new int[] {wc.getWords(), wc.getLines(), wc.getCoincidences(), (int)time };
    return res;
  }
}
