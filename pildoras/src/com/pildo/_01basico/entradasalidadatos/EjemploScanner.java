package com.pildo._01basico.entradasalidadatos;

import java.util.Scanner;

public class EjemploScanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombreUsuario = entrada.nextLine();

        System.out.println("Introduce tu edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + (edad+1) + " años");
    }
}
