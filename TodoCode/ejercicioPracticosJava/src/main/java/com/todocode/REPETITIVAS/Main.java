package com.todocode.REPETITIVAS;

import java.util.Scanner;

/**
 * Realizar un programa que dado por teclado un límite numérico por teclado (por ejemplo 100)
 * muestre por pantalla todos los números hasta ese limite (empezando por 1)
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese el limite hasta el que quiere contar");

        Scanner teclado = new Scanner(System.in);

        int limite = teclado.nextInt();
        int contador = 1;

        while(contador <= limite) {
            System.out.println(contador);
            //contador = contador + 1;
            contador++;
        }


    }
}
