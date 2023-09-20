import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BhaskaraCalculadora extends UnicastRemoteObject implements BhaskaraInterface {
    public BhaskaraCalculadora() throws RemoteException {
        super();
    }

    @Override
    public double[] calcularBhaskara(double a, double b, double c) throws RemoteException {
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return new double[] {};  // Sem raízes reais
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            return new double[] { raiz };  // Raiz única
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { raiz1, raiz2 };  // Duas raízes
        }
    }
}
