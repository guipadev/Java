package com.todocode.ejercicioPOOintegradorPlanta;

/**
 * # Crear una clase Planta con los atributos:
 * # nombre, alto del tallo, tieneHojas, clima ideal.
 * # con sus métodos y constructores correspondientes
 *
 * # Crear sus clases hijas que compartan sus atributos y métodos:
 * # Árbol: variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
 * # Flor: color de pétalos, cantidad promedio de pétalos, color del pistilo,
 * # color de los  pétalos, variedad de flor, estación que florece
 *
 * # Arbusto: Ancho arbusto, esDomestico, variedad arbusto, color de hojas, sePodaONo
 *
 * # Una vez creada las clases crear los siguientes métodos:
 * # Árbol: método para mostrar un mensaje en pantalla que diga "Hola soy un árbol"
 * # Flor: método para mostrar un mensaje en pantalla que diga "Hola soy una flor"
 * # Arbusto: método para mostrar un mensaje en pantalla que diga "Hola soy un arbusto"
 *
 * # Crear en el Main un objeto de cada clase hija. Llamar a los 3 métodos desde cada objeto.
 *
 * # Cambiar el modificador de acceso de los métodos de public a private. Intentar acceder
 * # desde el main a estos métodos.
 */

public class Main {

    public static void main(String[] args) {

        Arbol roble = new Arbol();
        Flor girasol = new Flor();
        Arbusto pinillo = new Arbusto();

        roble.saludo();
        girasol.saludo();
        pinillo.saludo();

    }
}