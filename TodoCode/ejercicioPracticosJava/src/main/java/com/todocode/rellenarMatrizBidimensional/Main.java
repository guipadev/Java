package com.todocode.rellenarMatrizBidimensional;

/**
 * Llevar a cabo un programa que permite cargar completamente on números 5 una matriz de 4x5 (4 filas, 5 columnas)
 */

public class Main {

    public static void main(String[] args) {

        // creamos
        int matriz[][] = new int [5][6];

        // rellenamos con números 5
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                matriz[f][c] = 5;
            }
        }

        // mostrar en pantalla
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.print("\n");
        }
    }

}