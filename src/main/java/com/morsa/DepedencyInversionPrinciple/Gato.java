package com.morsa.DepedencyInversionPrinciple;

/*
De esta forma la clase gato depende de la interfaz diagnosticador
nunca sabra que existe una clase veterinario

Solo va a tener idea de que hay un objeto que lo va a diagnosticar
* */

public class Gato {

    public int edad;
    public int pesoKg;
    private Diagnosticador diagnosticador;

    public Gato(Diagnosticador diagnosticador, int edad, int pesoKg) {
        this.edad = edad;
        this.pesoKg = pesoKg;
        this.diagnosticador = diagnosticador;
    }

    public boolean esUnGatoSaludable() {
        boolean diagnostico = diagnosticador.diagnosticar(this);
        return diagnostico;
    }
}