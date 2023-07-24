package com.ricardoromerobenitez.clases_objetos;

public class Vehiculo {

    public boolean peso;
    public String modelo;

    public Vehiculo() {}

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("Estoy conduciendo");
    }
}
