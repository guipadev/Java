package Absolute.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Es un grupo de elementos que tiene variables del mismo tipo
 * Puede ser int, double, String
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] Array = new int[3]; // Cantidad espacios a tener fijo

        int[] Array2 = {5, 3, 8};

        System.out.println(Arrays.toString(Array));


        System.out.println(Array2[0]);

        /**
         * Si tienes que llena 1000 espacios o ingresar estas variables como el siguiente ejemplo:
         * Se utilizaria el ciclo for:
         */
        int[] Array3 = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese un dato: ");

            int resp = sc.nextInt();

            Array3[i] = resp;
        }

        try {
            for (int j = 0; j < Array3.length; j++) {
                System.out.println(Array3[j]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera del rango válido del arreglo.");
        }
    }
}
