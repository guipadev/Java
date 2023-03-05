/*
Modele mediante una función matemática y desarrolle un algoritmo en Java con ciclos que permita hallar la posición del mínimo de un vector de números reales.
*/
package $06_Arrays;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector: ");

        int n = input.nextInt();

        // Crear el vector
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del vector: ");
            vector[i] = input.nextDouble();
        }

        // Encontrar la posición del mínimo
        int posicion_minimo = 0;

        for (int i = 1; i < n; i++) {
            if (vector[i] < vector[posicion_minimo]) {
                posicion_minimo = i;
            }
        }

        // Imprimir la posición del mínimo
        System.out.println("La posición del mínimo es " + (posicion_minimo + 1));
    }

}


