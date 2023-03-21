package com.charlycimino.$24SUPERlosContructoresNOseHeredan;

public class Auto extends Vehiculo {
    private boolean tieneAire;

    public Auto(String marca, String modelo, String patente, boolean tieneAire) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    public void prenderAire() {
        if (tieneAire) {
            System.out.println("Encendiendo AA...");
        }
    }

}
