import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        IReverseString remoteObject = (IReverseString) registry.lookup("RemoteObject");
        String response = remoteObject.reverseString("Hello, world!");
        System.out.println("Response from server: " + response);
    
}

}
