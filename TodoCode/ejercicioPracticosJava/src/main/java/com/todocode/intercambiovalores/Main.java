package com.todocode.intercambiovalores;

/**
 * Realizar un programa que permita el intercambio de valores entre dos variables
 * Por ejemplo: sin una variable numero vale 35, y una variable numero2 vale 20,
 * realizar las acciones necesarias para que numero tenga valor 20 y numero2 valor 35
 * Una vez realizado el cambio mostrar por pantalla
 */
public class Main {

    public static void main(String[] args) {

        int numero1 = 35;
        int numero2 = 20;
        int aux;

        System.out.println("--------------- ANTES ---------------");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);

        aux = numero2;
        numero2 = numero1;
        numero1 = aux;

        System.out.println("--------------- DESPUES ---------------");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);

    }
}
