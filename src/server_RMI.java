import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class server_RMI {
    public static void main(String[] args) {
        try {
            BhaskaraCalculadora calculadora = new BhaskaraCalculadora();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("BhaskaraCalculadora", calculadora);
            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            System.err.println("Erro no servidor RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
