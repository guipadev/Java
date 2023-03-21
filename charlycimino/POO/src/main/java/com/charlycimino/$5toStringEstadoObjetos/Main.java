package com.charlycimino.$5toStringEstadoObjetos;

public class Main {

    public static void main(String[] args) {

        Persona per1 = new Persona("Fulano", "Gomez", 25, false);
        Persona per2 = new Persona("Felina", "Garcia", 21, true);
        Persona per3 = new Persona("Fabian", "Gil", 15, false);

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
    }
}
