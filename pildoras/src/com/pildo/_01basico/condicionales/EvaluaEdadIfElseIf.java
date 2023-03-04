package com.pildo._01basico.condicionales;

import java.util.Scanner;

public class EvaluaEdadIfElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce edad");

        int edad = entrada.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad > 18 && edad < 30) {
            System.out.println("Eres adolecente");
        } else if (edad > 31 && edad < 100) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("No has nacido  o estamos muerto");
        }
    }


}
