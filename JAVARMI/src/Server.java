import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
        public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("RemoteObject", new ReverseStringImpl());
        System.out.println("Server is running...");
    }
}
