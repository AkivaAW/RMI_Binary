package touro.edu.mcon364;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Binary extends Remote {
    String ToBinary(int num) throws RemoteException;
}
