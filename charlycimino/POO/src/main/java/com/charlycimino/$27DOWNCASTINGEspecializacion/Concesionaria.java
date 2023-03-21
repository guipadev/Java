package com.charlycimino.$27DOWNCASTINGEspecializacion;

import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    // En una sola lista recibiremos motos y carros, gracias a la Generalización
    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        // Uso instanceof para validar si es un auto, tener la opcion de AA
        if (v instanceof Auto) {
            Auto a = (Auto) v;
            a.prenderAire();
        }
        this.vehiculos.add(v);
    }



}
