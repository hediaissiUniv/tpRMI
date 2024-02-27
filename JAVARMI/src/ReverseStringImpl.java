import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseStringImpl extends UnicastRemoteObject implements IReverseString {
    protected ReverseStringImpl() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String message) throws RemoteException {
        return new StringBuilder(message).reverse().toString();
    }
}