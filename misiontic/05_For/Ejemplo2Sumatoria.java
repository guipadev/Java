/*
La codificación en Java de una función que permite sumar 
los primeros n números naturales positivos junto con su programa principal es
 */
package EstructuraFor;

import java.util.Scanner;

public class Ejemplo2Sumatoria {
    
    public static int suma(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese # a calcular?: ");
        n = sc.nextInt();
        System.out.println("La suma de los primeros "
                + n + " numeros naturales es:");
        System.out.println(suma(n));
    }
    
}
