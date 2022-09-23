package com.morsa;

import static com.morsa.Utils.*;

public class Booleanos {

    public static void main(String[] args) {

        int pan1 = inputInt("Ingrese precio pan 1");
        int pan2 = inputInt("Ingrese precio pan 2");

        boolean esPan1MasCaroQuePan2 = pan1 > pan2;

        if (esPan1MasCaroQuePan2) {
            println("Pan 1 es mas caro que pan 2");
        } else {
            println("Pan 2 mas caro que pan 1");
        }

        String nombre1 = input("Ingrese primer nombre");
        String nombre2 = input("Ingrese segundo nombre");

        boolean numerosComparados = 1 == 1;
        boolean esNombre1IgualANombre2 = nombre1.equals(nombre2);

        if (esNombre1IgualANombre2) {
            println("El nombre 1 = nombre 2");
        } else {
            println("El nombre 1 NO = nombre 2");
        }
    }
}
