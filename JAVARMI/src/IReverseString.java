import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * IReverseString
 */
public interface IReverseString extends Remote{

     String reverseString (String mes) throws RemoteException;
    
}
