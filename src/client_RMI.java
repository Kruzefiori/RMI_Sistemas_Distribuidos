import java.rmi.Naming;

public class client_RMI {
    public static void main(String[] args) {
        try {
            BhaskaraInterface calculadora = (BhaskaraInterface) Naming.lookup("rmi://localhost/BhaskaraCalculadora");

            // Parâmetros da equação quadrática: ax^2 + bx + c = 0
            double a = 1.0;
            double b = -3.0;
            double c = 2.0;

            // Chamada remota para calcular Bhaskara
            double[] raizes = calculadora.calcularBhaskara(a, b, c);

            // Exibindo as raízes
            if (raizes.length == 0) {
                System.out.println("Não possui raízes reais.");
            } else if (raizes.length == 1) {
                System.out.println("Possui uma raiz: " + raizes[0]);
            } else {
                System.out.println("Possui duas raízes: " + raizes[0] + " e " + raizes[1]);
            }
        } catch (Exception e) {
            System.err.println("Erro no cliente RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
