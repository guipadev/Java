package com.charlycimino.$54GENERICSdevelandoLosDiamantesDelARRAYLIST;

import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {

        ArrayList<Persona> misAmigos = new ArrayList<>();
        ArrayList<Auto> misAutos = new ArrayList<>();

        misAmigos.add(new Persona("Juan", "Perez"));
        misAutos.add(new Auto("abc123", "Rojo"));

        System.out.printf("" + misAutos.toString());
    }
}
