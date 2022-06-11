package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
  void register(ClientInterface client) throws RemoteException;
  void message(String message) throws RemoteException;
}
