package com.charlycimino.$28ABSTRACTCLASESabstractas;

public class Moto extends Vehiculo {

    private int anchoManubrio;

    public Moto(String marca, String modelo, String patente, int anchoManubrio) {
        super(marca, modelo, patente);
        this.anchoManubrio = anchoManubrio;
    }

    public void hacerWheliee() {
        System.out.println("Haciendo wheliee...");
    }


}
