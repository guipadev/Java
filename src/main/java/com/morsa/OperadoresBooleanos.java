package com.morsa;

import static com.morsa.Utils.println;

public class OperadoresBooleanos {

    public static void main(String[] args) {

        boolean estaSoleado = false;
        int temperaturaHoy = 22;
        boolean esMayorA25LaTemp = temperaturaHoy >= 25;

        // & significa AND, && es el operador logico AND
        boolean puedoIrALaPlaya = estaSoleado && esMayorA25LaTemp;

        // operador OR, ||
        boolean estaAbiertaPanaderiaCarlos = true;
        boolean estaAbiertaPanaderiaMaria = true;
        boolean hayAlgunaPanaderiaAbierta = estaAbiertaPanaderiaMaria || estaAbiertaPanaderiaCarlos;

        println("Hay alguna panaderia abierta? " + hayAlgunaPanaderiaAbierta);

        // NOT operador -> transforma false a true, o true a false
        println((!false) + "");

        println("Estan todas las panaderias cerradas? " + !hayAlgunaPanaderiaAbierta);
    }
}
