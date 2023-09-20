import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BhaskaraInterface extends Remote {
    double[] calcularBhaskara(double a, double b, double c) throws RemoteException;
}