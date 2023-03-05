/*
Imprimir un listado con los números impares desde 1 hasta 999 y
seguidamente otro listado con los números pares desde 2 hasta 1000.
*/

package $05_For;

public class Problema2paresEimpares {
    public static void main(String[] args) {
        int i, j;

        System.out.println("numero impares de 1 a 999");

        for (i = 1; i <= 99; i += 2) {
            System.out.print(i + ",");
        }

        System.out.println("\n numero pares de 2 a 1000");

        for (j = 2; j <= 100; j += 2) {
            System.out.print(j + ",");
        }
    }
}
