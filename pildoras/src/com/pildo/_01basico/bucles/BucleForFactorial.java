package com.pildo._01basico.bucles;

import javax.swing.*;

public class BucleForFactorial {

    public static void main(String[] args) {

        Long resultado = 1L;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}
