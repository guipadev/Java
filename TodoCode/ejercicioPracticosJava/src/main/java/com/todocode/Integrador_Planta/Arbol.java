package com.todocode.ejercicioPOOintegradorPlanta;

public class Arbol extends Planta {

    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    public Arbol() { }

    public Arbol(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    @Override
    protected void saludo() {
        System.out.println("Hola, soy un arbol");
    }
}