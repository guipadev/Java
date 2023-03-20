package com.dev._01_determinarMayorNo;

import javax.swing.*;

/*
Problema:
Algoritmo que solicite 2 numeros y determine cual es el mayor cual es el menor o si son iguales
Solucion:
Se resuelve con estructuras condiciones simples y luego se resuelve con dobles y anidadas explicando
el detalle paso a paso mejores prácticas y validaciones
 */
public class App {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0, i = 0;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de veces a repetir"));

        do {

            do {
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));

                if (num1 < 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero positivo","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } while (num1 < 0);

            do {
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));

                if (num2 < 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero positivo", "WARNING",JOptionPane.WARNING_MESSAGE);
                }
            } while (num1 < 0);



            System.out.println(1);

            if (num1 > num2) {
                System.out.println(num1 + " es mayor que " + num2);
            } else if (num1 < num2) {
                System.out.println(num2 + " es mayor que " + num1);
            } else if (num1 == num2) {
                System.out.println(num2 + " es igual que " + num1);
            }

            i++;

        } while (i < n);
    }
}
