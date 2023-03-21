package com.charlycimino.$15calcularpromedios;

public class Auto {

    private String patente;
    private String color;
    private int kmsRecorridos;

    public Auto(String patente, String color, int kmsRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmsRecorridos = kmsRecorridos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKmsRecorridos() {
        return kmsRecorridos;
    }

    public void setKmsRecorridos(int kmsRecorridos) {
        this.kmsRecorridos = kmsRecorridos;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
