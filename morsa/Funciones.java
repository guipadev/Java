package com.morsa;

import static Utilidades.Utils.*;

public class Funciones {

    public static void main(String[] args) {

        int edad = inputInt("Que edad tienes? ");
        //boolean esMayor = esMayorEdad(edad);

        if (esMayorEdad(edad)) {
            println("Eres mayor de edad");
        } else {
            println("Aun no eres mayor de edad");
        }

    }

    public static boolean esMayorEdad(int edadPersona) {
        boolean esMayor18 = edadPersona >= 18;

        return esMayor18;
    }
}
