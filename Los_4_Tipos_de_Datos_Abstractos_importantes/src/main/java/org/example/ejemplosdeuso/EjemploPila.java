package org.example.ejemplosdeuso;

import org.example.implementaciones.PilaEnlazada;
import org.example.interfaces.Pila;

public class EjemploPila {

    public static void main(String[] args) {

        Pila<Character> pila = new PilaEnlazada<>();

        pila.apilar('a');
        pila.apilar('b');
        pila.apilar('c');
        pila.apilar('d');
        pila.apilar('e');

        System.out.println(pila.size());
        System.out.println(pila.tope());
        System.out.println(pila.size());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());

        pila.apilar('f');
        pila.apilar('g');

        System.out.println(pila.tope());
    }
}
