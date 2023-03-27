package com.company;

public class Funciones {

    // si no se coloca ningun tomara como defecto protected
    // public desde cualquier parte ejecuta las funciones
    // protected solo dentro del paquete se puede leer, aplicado a herencia y clases hijas

    public static void main(String[] args) {

        holaMundo();
        holaMundoParametros("Crhistina");

        String hola = devolverHOla();
        System.out.println(hola);

        // Resultados funciones recargadas
        holaMundo("Betty");
        holaMundo("Betty", "Lozada");
        holaMundo(2);
    }

    private static void holaMundo() {
        System.out.println("Hola mundo desde un método");
    }

    private static void holaMundoParametros(String name) {
        System.out.println("Hola mundo desde un método " + name);
    }

    private static String devolverHOla() {
        return "Devolver texto";
    }

    // Funciones sobre cargadas
    private static void holaMundo(String name) {
        System.out.println("Hola mundo " + name);
    }

    private static void holaMundo(String name, String lastName) {
        System.out.println("Hola mundo " + name + " " + lastName);
    }

    private static void holaMundo(int name) {
        System.out.println("Hola mundo " + name);
    }
}
