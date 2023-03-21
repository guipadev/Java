package com.charlycimino.$13atributostipocolecciondeobjetos;

public class Main {

    public static void main(String[] args) {

        Consecionaria c = new Consecionaria("Toyoi");

        c.mostrarAutos();

        // Aqui sabemos como se hace y no deberiamos
        //c.getAuto().add(new Auto("123", "Rojo"));
        //c.getAuto().add(new Auto("873", "Rosa"));
        //c.getAuto().add(new Auto("483", "Cafe"));

        // Agregar autos a la concesionaria, pero sin devolver la referencia de la lista
        // Puedo agregar y mostrar sin saber como se hace el proceso
        // La lista concesionario solo sera la que puede modificar la lista carros creada
        c.agregarAuto(new Auto("123", "Rojo"));
        c.agregarAuto(new Auto("873", "Rosa"));
        c.agregarAuto(new Auto("483", "Cafe"));

    }
}
