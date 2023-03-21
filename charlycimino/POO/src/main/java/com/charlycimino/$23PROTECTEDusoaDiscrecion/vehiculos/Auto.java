package com.charlycimino.$23PROTECTEDusoaDiscrecion.vehiculos;

public class Auto extends Vehiculo {

    private boolean tieneAire;

    public void prenderAire() {
        if (tieneAire) {
            System.out.println("Encendiendo AA...");
        }
    }

}
