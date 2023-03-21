package com.charlycimino.$25UPCASTINGGeneralizacion;

import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    // En una sola lista recibiremos motos y carros, gracias a la Generalización
    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo a) {
        this.vehiculos.add(a);
    }



}
