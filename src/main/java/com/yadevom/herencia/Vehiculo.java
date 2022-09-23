package com.yadevom.herencia;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private int  numRuedas;
    private String color;
    private int numPasajeros;

    protected List<String> pasajeros = new ArrayList<String>();

    public Vehiculo(int numRuedas, String color, int numPasajeros) {
        this.numRuedas = numRuedas;
        this.color = color;
        this.numPasajeros = numPasajeros;
    }

    public void anadirPasajero(String nombrePasajero) {
        pasajeros.add(nombrePasajero);
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
}
