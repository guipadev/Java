package com.charlycimino.$19SCANNERCrearTuPropiaLibreriaParaLeerDeConsola;

/**
 * https://www.youtube.com/watch?v=XeZGv_jT4fk
 * Generar JAR en NetBeans o Eclipse para utilizar la libreria
 */
public class Main {

    public static void main(String[] args) {

        //Consola.escribir("¿Cuál es tu nombre?");
        //String nombre = Consola.leer();
        String nombre = Consola.leer("¿Cuál es tu nombre?");
        Consola.escribir("Hola " + nombre);
    }
}
