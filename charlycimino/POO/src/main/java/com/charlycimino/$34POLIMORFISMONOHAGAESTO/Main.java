package com.charlycimino.$34POLIMORFISMONOHAGAESTO;

public class Main {

    public static void main(String[] args) {

        Veterinaria v = new Veterinaria();

        v.agregarMascota(new Perro());
        v.agregarMascota(new Gato());
        v.agregarMascota(new Perro());
        v.agregarMascota(new Gato());
        v.agregarMascota(new Perro());

        v.saludarACliente();
    }
}
