package condicionales;

import java.util.Scanner;

public class Real {
    
    public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        }else {
            valor = -x;
        }
        return valor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("n?");
        n = sc.nextDouble();
        System.out.println("El valor absoluto de "
                + n + " es " + valorAbsoluto(n));
    }
}
