package touro.edu.mcon364;

import java.rmi.Naming;

public class ClientRequest {
    public static void main(String[] args) throws Exception {
        String answer;
        int num = 45;
        try {
            // lookup method to find reference of remote object
            Binary access = (Binary) Naming.lookup("rmi://localhost:1377"+ "/BinaryObject");
            answer = access.ToBinary(num);
            System.out.println( num + " in binary is " + answer );
        }
        catch(Exception ae) {
            throw new Exception(ae);
        }
    }
}
