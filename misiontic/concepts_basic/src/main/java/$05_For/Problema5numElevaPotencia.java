/*
Calcular el valor de 2 elevado a la potencia n.
*/

package $05_For;

import java.util.Scanner;

public class Problema5numElevaPotencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de número a calcular elevado al cuadrado: ");

        int num = sc.nextInt();

        System.out.println("Ingrese la potencia a obtener: ");

        int pot = sc.nextInt();

        System.out.println(elevado(num, pot));
    }

    public static double elevado(int numero, int potencia) {
        int pot = potencia;
        int num = numero;

        for (int i = 1, j = 1; i <= num; i++, j++) {
            System.out.println("#: " + i + ", potencia " + Math.pow(j, pot)); // orden primero # y luego potencia
        }
        return pot;
    }
}
