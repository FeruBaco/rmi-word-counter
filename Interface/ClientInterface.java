package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {
  void clientMessage(String message, int[] seqData, int[] exeData, int[] conData) throws RemoteException;
}
