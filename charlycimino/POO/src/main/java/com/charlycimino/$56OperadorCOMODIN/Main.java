package com.charlycimino.$56OperadorCOMODIN;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Auto> misAutos = new ArrayList<>();
        ArrayList<Persona> misAmigos = new ArrayList<>();

        misAmigos.add(new Persona("Juan", "Perez"));
        misAmigos.add(new Persona("Maria", "Gomez"));
        misAmigos.add(new Persona("Ana", "Lopez"));

        misAutos.add(new Auto("ABC123", "Rojo"));
        misAutos.add(new Auto("DEF456", "Rosa"));
        misAutos.add(new Auto("GHI789", "Gris"));

        UtilLista.mostrarLista(misAmigos);
        UtilLista.mostrarLista(misAutos);
    }
}
