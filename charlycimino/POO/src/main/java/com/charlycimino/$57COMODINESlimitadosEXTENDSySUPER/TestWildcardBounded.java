package com.charlycimino.$57COMODINESlimitadosEXTENDSySUPER;

import java.util.ArrayList;

public class TestWildcardBounded {

    public static void main(String[] args) {
        Persona juan = new Persona("Juan","Perez");
        Deportista usain = new Deportista("Usain", "Bolt", 100);
        Deportista roger = new Deportista("Roger", "Federer", 70);
        Futbolista leo = new Futbolista("Lionel", "Messi", 80, 10);
        Futbolista cristiano = new Futbolista("Cristiano", "Ronaldo", 85, 7);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(juan);
        personas.add(usain);
        personas.add(roger);
        personas.add(leo);
        personas.add(cristiano);

        ArrayList<Deportista> deportistas = new ArrayList<>();
        deportistas.add(usain);
        deportistas.add(roger);

        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(leo);
        futbolistas.add(cristiano);

        UtilListas.agregarDeportistaALaLista(personas, "Pepe", "Gomez", 100);
        UtilListas.mostrarLista(personas);
    }
}
