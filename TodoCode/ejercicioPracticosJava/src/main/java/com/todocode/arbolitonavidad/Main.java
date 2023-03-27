package com.todocode.arbolitonavidad;

/*
     *
    ***
   *****
  *******
 *********
    ||
*/

public class Main {

    public static void main(String[] args) {

        // Declaro alura del árbol, la que desie
        int altura = 10;

        // Bucle recorre todas las filas (altura)
        for (int fila = 0; fila < altura; fila++) {
            // bucle para los espacios
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            // bucle para los asteriscos
            for (int asteriscos = 0; asteriscos < (fila * 2) + 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // tronco, siempre tener en cuenta altura del arbol - 2 (si tiene el arbol 10 aqui debe ser 8)
        int largoTronco = 3;

        for (int base = 0; base < largoTronco; base++) {
            // espacios en blanco
            for (int espacio = 0; espacio <(altura - 2); espacio++) {
                System.out.print(" ");
            }
            // barritas tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            // salto linea
            System.out.println("");
        }

    }
}
