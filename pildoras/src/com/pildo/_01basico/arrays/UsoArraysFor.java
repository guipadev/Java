package com.pildo._01basico.arrays;

public class UsoArraysFor {

    public static void main(String[] args) {

        int [] miMatriz = new int[5];

        miMatriz[0] = 5;
        miMatriz[1] = 38;
        miMatriz[2] = 15;
        miMatriz[3] = 92;
        miMatriz[4] = 71;

        System.out.println(miMatriz[1]);
        System.out.println(miMatriz[2]);
        System.out.println(miMatriz[3]);
        System.out.println(miMatriz[4]);


        int [] miMatriz2 = {5, 38, -15, 92, 71};

        for (int i = 0; i < miMatriz2.length; i++)  {
            System.out.println("Valor indice " + i + " = " + miMatriz2[i]);
        }
    }
}
