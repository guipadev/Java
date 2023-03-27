package com.dev._05_calculaSumaNPrimos;

import javax.swing.*;

/*
PROBLEMA:
Dado un numero natural n, calcular la suma de los primeros n números naturales.
Esto lo debe realizar las veces que el usuario decida valide que no permita
el ingreso de datos negativos

SOLUCION:
Se resuelve estructuras de control y ciclos, mostrando diferentes maneras de validar el ingreso
de números
 */
public class App2 {

    public static void main(String[] args) {

        double n = 0;

        String resp = "";

        do {
            n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));

            if (n > 0) {
                double suma = (n * (n + 1)) / 2;

                System.out.println("La suma es: " + suma);
            } else {
                System.out.println("El número es negativo");
            }

            resp = JOptionPane.showInputDialog("Ingrese 'Si' para continuar");
        } while (resp.equalsIgnoreCase("si"));
    }
}