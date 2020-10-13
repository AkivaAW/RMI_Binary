package touro.edu.mcon364;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NumToBinary extends UnicastRemoteObject implements Binary {
    protected NumToBinary() throws RemoteException {
        super();
    }

    @Override
    public String ToBinary(int num) throws RemoteException {
        String binary = "";
        if (num >= 256 || num < 0){
            return "This program only handles numbers between 0 and 255";
        }
        else {
            binary +=  (num / 128);
            num %= 128;
            binary +=  (num / 64);
            num %= 64;
            binary +=  (num / 32);
            num %= 32;
            binary +=  (num / 16);
            num %= 16;
            binary +=  (num / 8);
            num %= 8;
            binary +=  (num / 4);
            num %= 4;
            binary +=  (num / 2);
            num %= 2;
            binary +=  (num);

            return binary;
        }
    }
}
