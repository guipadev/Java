package com.pildo._01basico.strings;

public class ManipulacionString {

    public static void main(ManipulacionString[] args) {
        String nombre = "Juan";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");

        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultimaLetra;

        ultimaLetra = nombre.length();

        System.out.println("Ultima letra es la " + nombre.charAt(ultimaLetra));
    }
}
