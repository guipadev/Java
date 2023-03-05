package $06_Arrays;

/*
 Programa que lea por teclado 10 números enteros y los guarde en un array.
 A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
 */

import java.util.Scanner;

class Ejercicio1calculoMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        // contadores de # positivos y negativos
        int pos = 0, neg = 0;

        // array int de 10 posiciones, contendrá los # ingresados
        int[] numeros = new int[10];

        // acumuladores para las sumas de positivos y negativos
        double sumaPos = 0, sumaNeg = 0;

        // lectura de datos y llenar el array
        System.out.println("Vamos empezar a guardar 10 numeros en el array, pueden ser números positivos o negativos: ");

        for (i = 0; i < 10; i++) {
            System.out.print("numero[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        // recorrer array para sumar por separado los numreros + y -
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0) { // sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) { // sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }

        // Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }

        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
}