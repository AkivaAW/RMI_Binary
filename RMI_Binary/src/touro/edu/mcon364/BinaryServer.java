package touro.edu.mcon364;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BinaryServer {
    public static void main(String[] args) throws Exception{
        try{
            Binary binary = new NumToBinary();

            // rmi registry within the server JVM with port number 1377
            LocateRegistry.createRegistry(1377);

            // Binds the remote object by the name someObject
            Naming.rebind("rmi://localhost:1377"+ "/BinaryObject",binary);
        }
        catch(Exception ae) {
            throw new Exception(ae);
        }
    }
}

