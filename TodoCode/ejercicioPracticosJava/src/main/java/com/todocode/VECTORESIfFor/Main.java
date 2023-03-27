package com.todocode.VECTORESIfFor;

import java.util.Scanner;

// Realizar un programa que permita cargar 15 números en un vector.
// Una vez cargados, se necesita que el programa cuente e informe por pantalla
// cuántas veces se cargó el número 3

public class Main {

    public static void main(String[] args) {

        int vector [] = new int [15];
        try (Scanner teclado = new Scanner (System.in)) {
            // Cargar nuestro vector
            for (int i = 0; i < 15; i++) {
                System.out.println("Ingrese un número en el vector");
                vector[i] = teclado.nextInt();
            }
        }

        // Recorrer y contar cuántos números 3 hay
        int contador = 0;

        for (int i = 0; i < 15; i++) {

            if(vector[i] == 3) {
                contador += 1;
            }
        }
        System.out.println("La cantidad de números 3 que hay el vector es: " + contador);
    }

}
