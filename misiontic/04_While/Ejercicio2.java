/*
Imprimir un listado con los números impares desde 1 hasta 999 y
seguidamente otro listado con los números pares desde 2 hasta 1000.
 */
package EstructurasCiclicas;

public class Ejercicio2 {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 999; i += 2) {
            System.out.println(+i);
        }
        for (j = 0; j <= 100; j += 2) {
            System.out.println(+j);
        }
    }
}
