package com.ricardoromerobenitez.herencia;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Coche(50, "Negro");
        Vehiculo vehiculo2 = new Bicicleta("GT", "Verde");
        Vehiculo vehiculo3 = new Moto(false, "Amarillo");
    }
}
