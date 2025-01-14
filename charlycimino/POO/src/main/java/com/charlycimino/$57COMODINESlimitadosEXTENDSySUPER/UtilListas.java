package com.charlycimino.$57COMODINESlimitadosEXTENDSySUPER;

import java.util.List;

public class UtilListas {

    // Unbounded wildcard
    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }

    // Upper bounded wildcard (con superclase)
    public static void mostrarListaDePersonas(List<? extends Persona> laLista) {
        for (Persona p : laLista) {
            System.out.println( p.nombreCompleto() );
        }
    }

    // Upper bounded wildcard (con interfaz)
    public static void entrenarListaDeEntrenables(List<? extends Entrenable> laLista) {
        for (Entrenable p : laLista) {
            p.entrenar();
        }
    }

    // Lower bounded wildcard
    public static void agregarDeportistaALaLista(List<? super Deportista> laLista, String nom, String ape, int ene) {
        // Construir y agregar un deportista a la lista
        Deportista d = new Deportista(nom,ape,ene);
        laLista.add(d);
    }
}
