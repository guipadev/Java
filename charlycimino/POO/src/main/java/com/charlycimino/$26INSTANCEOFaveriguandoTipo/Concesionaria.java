package com.charlycimino.$26INSTANCEOFaveriguandoTipo;

import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    // En una sola lista recibiremos motos y carros, gracias a la Generalización
    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        this.vehiculos.add(v);

        // preguntar el tipo System.out.println(v instanceof Vehiculo);

        if (v instanceof  Auto) {
            System.out.println("Se agrego un auto");
        }
    }



}
