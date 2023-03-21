package com.charlycimino.$26INSTANCEOFaveriguandoTipo;

public class Main {

    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();

        Auto a = new Auto("Yamaha", "ESK45", "F5S", true);

        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto("Suzuki", "Best125", "S75S", 20));

    }
}
