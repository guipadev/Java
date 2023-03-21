package com.charlycimino.$25UPCASTINGGeneralizacion;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    private void chequeandoMotor() {
        System.out.println("Chequeando motor...");
    }
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    public void encender() {
        System.out.println("Encendiendo...");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
