/*
Leer un número natural n, leer otro dato de tipo real x y calcular xn.
*/
package $05_For;

import java.util.Scanner;

public class Problema6realElevado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número natural n: ");

        int n = input.nextInt();

        System.out.print("Ingrese un número real x: ");

        double x = input.nextDouble();

        double resultado = 1.0; // Inicializar el resultado en 1

        for (int i = 1; i <= n; i++) {
            resultado *= x; // Multiplicar el resultado por x en cada iteración
        }

        System.out.println(x + " elevado a la potencia " + n + " es igual a " + resultado);
    }
}
