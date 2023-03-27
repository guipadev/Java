package com.todocode.MATRICESIfFor;

import java.util.Scanner;

/*
En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
Cada fila corresponde a las notas y al promedio de cada alumno.
Se necesita un programa que permita a un profesor cargar,
en las 3 posiciones (columnas) de cada fila, las notas del alumno y que en la última
columna se calculen los promedios.
Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno
y el promedio correspondiente recorriendo la matriz
*/

public class Main {

    public static void main(String[] args) {

        Double matriz[][] = new Double [4][4];

        try (Scanner teclado = new Scanner (System.in)) {
            Double suma = 0.0;

            // Cargar
            for (int fila = 0; fila < 4; fila++) {
                for (int columna = 0; columna < 3; columna++) {
                    System.out.println("Ingrese el alumno # " + fila);
                    matriz[fila][columna] = teclado.nextDouble();
                    // Suma calificación
                    suma = suma + matriz[fila][columna];
                }
                // Calculo promedio 4 columna
                matriz[fila][3] = suma / 3;
                // Solo vuelve a 0 para no acumular a los otros alumnos
                suma = 0.0;
            }
        }
        // Recorrer
        // Cargar
        for (int fila = 0; fila < 4; fila++) {
            System.out.println("Las notas del alumno # " + fila + " son: ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("La nota # " + columna + " " + matriz[fila][columna]);
            }
            System.out.println("El promedio de las notas es: " + matriz[fila][3]);
        }

    }


}
