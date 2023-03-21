package com.charlycimino.$28ABSTRACTCLASESabstractas;

public class Main {

    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        Auto a = new Auto("Yamaha", "ESK45", "F5S", true);

        Vehiculo v = a;

        // Evita que exista objetos de tipo vehiculo para no tener inconsistencias
        //Auto a2 = (Auto) v;
        //a2.prenderAire();

        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto("Suzuki", "Best125", "S75S", 20));

    }
}
