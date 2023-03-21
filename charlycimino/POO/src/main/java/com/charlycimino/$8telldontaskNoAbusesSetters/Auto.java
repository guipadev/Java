package com.charlycimino.$8telldontaskNoAbusesSetters;

public class Auto {

    private String patente;
    private String marca;
    private double precio;
    private String color;
    private Motor motor;

    public Auto(String patente, String marca, double precio, String color, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
    }

    // Se expone para que la clase realice el proceso
    /*
    public Motor getMotor() {
        return motor;
    }
     */

    // Por lo cual mediante un metodo debe acelerar
    public void acelerar() {
        // Pero aqui seguimos dependiendo de realizar logica de la clase motor
        //this.motor.setRpmActuales(this.motor.getRpmActuales() + 1000);
        // Con la logica implementada en Motor, solo necesiamos indicar que cuando el carro acelere
        // el motor del carro tambien acelera
        this.motor.acelerar();
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                '}';
    }
}
