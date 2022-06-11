package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JLabel;

import Interface.ServerInterface;

public class RMIClient {
  public void init (String word, JLabel[] labels) {
    try {
      String name = "Fer";
      Registry rmi = LocateRegistry.getRegistry("localhost", 1005);

      ServerInterface server = (ServerInterface) rmi.lookup("Proyecto");
      new Thread(new ProcessImplementation(name, server, word, labels)).start();

    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
