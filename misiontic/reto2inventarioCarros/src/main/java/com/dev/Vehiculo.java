package com.dev;

public class Vehiculo {
    private int velocidad;
    private int pasajeros;
    private String placa;

    public Vehiculo() {
        velocidad = 0;
        pasajeros = 0;
        placa = "";
    }

    public Vehiculo(int velocidad, int pasajeros, String placa){
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.placa = placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        String s = "";
        s+="Placa: " + placa + "\n";
        s+="\tVelocidad: " + velocidad + " km/h\n";
        s+="\tPasajeros: " + pasajeros + "\n";

        return s;
    }
}
