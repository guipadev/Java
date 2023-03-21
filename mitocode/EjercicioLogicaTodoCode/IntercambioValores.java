package com.EjercicioLogicaTodoCode;

/*
* Realizar un programa que permita el intercambio de valores entre dos variables.
* Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
* realizar las acciones necesarias para que nùmero pasea a valer 20 y numero2
* pase a valer35. Una vez realizado el cambio mostrar el resultado por pantalla.
* */

public class IntercambioValores {

    public static void main(String[] args) {

        int num1 = 35;
        int num2 = 20;
        int aux;

        System.out.println("---- Valores Antes ----");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);


        aux = num2;
        num2 = num1;
        num1 = aux;

        System.out.println("---- Valores Déspues ----");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
    }
}
