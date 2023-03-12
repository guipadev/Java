import java.util.Scanner;

public class ValorReal {
    
    public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        } else {
            valor = -x;
        }
        return valor;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("n?");
        n = sc.nextDouble();
        System.out.println("El valor absoluto de "+ n + " es " + valorAbsoluto(n));
    }
    
}
