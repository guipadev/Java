package com.morsa;

import static com.morsa.Utils.*;

public class Programa1 {

    public static void main(String[] args) {

        String nombre = input("Ingrese nombre: ");
        int edad = inputInt("Ingrese edad: ");

        println("Hola " + nombre + " tu edad es " + edad);
    }
}
