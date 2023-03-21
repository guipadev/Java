package com.charlycimino.$25UPCASTINGGeneralizacion;

public class Main {

    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("Yamaha", "RX-115", "VFF45");
        Auto a = new Auto("BMW", "4X4", "ABC123", true);
        Moto m = new Moto("Suzuki", "Best125", "XHT", 20);

        // Este es el proceso de Generalizacion
        // Java hacer automaticamente un casteo (Vehiculo)
        Vehiculo a2 = new Auto("BMW", "4X4", "ABC123", true);
        Vehiculo a3 = a;

        // Aplicaciòn Generalizaciòn clase Consesionaria
        Concesionaria c = new Concesionaria();

        c.agregarVehiculo(new Auto("Jaguar", "RS2000", "MSF4S", true));
        c.agregarVehiculo(new Moto("Toyota", "RW1000", "M4S54", 23));

        // Generalizar implica tratar al objeto como si fuera de un tipo mas alto
        // en la jerarquia de herencia
        Auto x = new Auto("Renault", "Symbol","S87FS", true);

        x.acelerar();
        x.toString();
        x.prenderAire();

        Vehiculo y = a;

        y.acelerar();
        y.toString();
        // Generalizar implica tratar al objeto como si fuera de un tipo mas alto en la jerarquia de herencia
        // y.prenderAire();

        c.agregarVehiculo(y);


        // Un auto se puede convertir a vehiculo
        // Pero no un vehiculo a un auto
        // Auto z = v;

    }
}
