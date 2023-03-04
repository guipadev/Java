package com.pildo._08herenciaclaseabstract;

public abstract class Persona {

    private String nombre;

    public Persona(String nom) {
        this.nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();
}
