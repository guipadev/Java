package com.yadevom._1clasesInternas_INNER_CLASS;
/**
 * En Java, también es posible anidar clases (una clase dentro de una clase). El propósito de las clases anidadas es agrupar clases que pertenecen juntas, lo que hace que su código sea más legible y fácil de mantener.
 */

public class Main {

    public static void main(String[] args) {

        // Creacion de clase interna, para no tener que inicializar la clase externa
        // para utilizar la clase interna la volvemos tipo estatica
        ClaseExterna claseExterna = new ClaseExterna();
        claseExterna.metodoEjemplo();
        // claseExterna.metodoLocal(); esto no se podria

        //ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();
        ClaseExterna.ClaseInterna claseInterna = new ClaseExterna.ClaseInterna();
        claseInterna.metodoInterno();
    }
}
