package Server;

import java.rmi.registry.LocateRegistry;
import java.net.InetAddress;
import java.rmi.Remote;
import java.rmi.registry.Registry;

public class RMIServer {
  
  public static void main (String[] args) {
    final int PORT = 1005;

    try {
      System.setProperty("java.rmi.server.hostname", InetAddress.getLocalHost().toString());
      Registry rmi = LocateRegistry.createRegistry(PORT);
      rmi.rebind("Proyecto", (Remote) new ProcessImplementation());
      System.out.println("Servidor activo " + PORT);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
