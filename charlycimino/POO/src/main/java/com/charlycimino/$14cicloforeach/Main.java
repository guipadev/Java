package com.charlycimino.$14cicloforeach;

public class Main {

    public static void main(String[] args) {

        // Uso del For Each en la clase concesionaria
        Consecionaria c = new Consecionaria("Toyoi");


        c.agregarAuto(new Auto("123", "Rojo"));
        c.agregarAuto(new Auto("873", "Rosa"));
        c.agregarAuto(new Auto("483", "Cafe"));

        c.mostrarAutos();
    }
}
