package com.pildo._01basico.entradasalidadatos;

import javax.swing.*;

public class EjemploJOptionFormateoNumeros {

    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Introduce un número");

        double num2 = Double.parseDouble(num1);

        System.out.println("La raíz de " + num2 + " es ");

        // Muestra cantidad de decimales
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
