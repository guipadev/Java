package com.charlycimino.$61BUSCADORGENERICONomasCopyPaste;

import java.util.ArrayList;

/**
 * Si te cansas de realizar las comparaciones para busquedas en el algoritmo, ya que se debe estar cambiando los tipos
 * de datos y la pregunta que se hace para encontrar el objeto
 *
 * Ahora vamos a realizar la busqueda para que sirva para cualquier circunstancia, para cualquier situación, para cualquier
 * búsqueda del tipo que sea con el ID que sea
 */
public class Main {

    /**
     * El objetivo del algoritmo es buscar un auto dentro de esta lista, conociendo la patente del auto y buscar una persona
     * conociendo el DNI de la persona en la otra lista
     * Las patentes son Strings y los DNI númericos
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BCD234", "Verde"));
        autos.add(new Auto("DEF458", "Blanco"));
        autos.add(new Auto("CDE345", "Azul"));
        autos.add(new Auto("DEF457", "Gris"));

        // Buscar Autos
        Buscador<Auto, String> buscadorDeAutosPorPatente;
        buscadorDeAutosPorPatente = new Buscador<>();
        Auto a = buscadorDeAutosPorPatente.buscar(autos, "CDE345");
        System.out.println(a);


        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1234, "Pepe", "Gomez"));
        personas.add(new Persona(1596, "Ana", "Perez"));
        personas.add(new Persona(7645, "Luis", "Lopez"));
        personas.add(new Persona(2345, "Lía", "Alvarez"));
        personas.add(new Persona(4763, "Sara", "Britez"));

        // Buscar Personas
        Buscador<Persona, Integer> buscadorDePersonasPorDNI;
        buscadorDePersonasPorDNI = new Buscador<>();
        Persona p = buscadorDePersonasPorDNI.buscar(personas, 2345);
        System.out.println(p);


    }
}
