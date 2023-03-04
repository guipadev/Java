/*
Imprimir los números de 1 hasta un número natural n dado, cada uno con su respectivo factorial.
*/
package EstructuraFor;

import java.util.Scanner;

public class Problema4 {
    public static int factorial(int n) {
        int factor = 1;
        for (int i = 1, j = 1; i <= n; i++, j++) {
            System.out.println("#: " + i + ", factorial " + (factor = factor * j));
        }
        return factor;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese # a calcular factorial: ");
        n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
