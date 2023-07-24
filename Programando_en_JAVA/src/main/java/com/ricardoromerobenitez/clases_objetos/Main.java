package com.ricardoromerobenitez.clases_objetos;

public class Main {

    /**
     * La diferencia entra Clase y Objeto es:
     * La Clase es el modelo o la forma, es una entidad logica  no tiene un valor en memoria,
     * se declara con la palabra clave Class. Es un grupo que identifica Objetos.
     * Esta se declara una vez.
     *
     * El Objeto es la instancia de la Clase, es una entidad fisica, tiene un valor en memoria,
     * se declara con la palabra clave New. Los objetos son especificos de una entidad que puede ser cualquiera.
     * Se puede declara muchas veces
     */

    public static void main(String[] args) {

        Vehiculo miCarro = new Vehiculo("Mercedes");
        miCarro.conducir();
        miCarro.modelo = "BMW";

        Vehiculo otroCarro = new Vehiculo();
        otroCarro.conducir();

        Vehiculo unCarro = new Vehiculo("Jaguar");
        unCarro.peso = true;

    }
}
