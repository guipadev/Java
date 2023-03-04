package com.pildo._06herencia;

public class Furgoneta extends Coche {

    private int capacidadCarga;

    private int plazaExtra;

    public Furgoneta(int plazaExtra, int capacidadCarga) {
        super(); // Llama al constructor de la clase padre
        this.capacidadCarga = capacidadCarga;
        this.plazaExtra = plazaExtra;
    }

    public String dimeDatosFurgoneta(){
        return "La capacidad de carga: " + capacidadCarga + " Y las plazas son " + plazaExtra;
    }
}
