package com.charlycimino.$22HERENCIAextends;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String patente;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
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
}
