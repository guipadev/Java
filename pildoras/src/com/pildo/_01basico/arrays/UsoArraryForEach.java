package com.pildo._01basico.arrays;

import javax.swing.*;

public class UsoArraryForEach {

    public static void main(String[] args) {

        String [] paises = new String[5];

        /*
        paises[0] = "España";
        paises[1] = "Colombia";
        paises[2] = "Italia";
        paises[3] = "Francia";
        paises[4] = "Mexico";
         */

        //String [] paises = {"Mexico", "España", "Colombia", "Italia", "Noruega"};

        // Ingresar datos
        for(int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce pasi " + (i + 1));
        }

        // Recorrer y mostrar
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i + 1) + " " + paises[i]);
        }

        // Mostrar y recorrer
        for(String elemento : paises) {
            System.out.println("El pais: " + elemento);
        }


        // Diligenciar automaticamente matriz numero aleatorios
        int [] matriz_aleatorios = new int[150];

        for (int i = 0; i < matriz_aleatorios.length; i++) {
            matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
        }

        // mostrar
        for (int numeros : matriz_aleatorios) {
            System.out.print(numeros + " ");
        }
    }
}
