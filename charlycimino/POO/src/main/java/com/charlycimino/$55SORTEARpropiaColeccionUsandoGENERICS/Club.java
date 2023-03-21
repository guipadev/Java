package com.charlycimino.$55SORTEARpropiaColeccionUsandoGENERICS;

public class Club {

    private String nombre;
    private PaisSudamericano pais;

    public Club(String nombre, PaisSudamericano pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre + " de " + pais;
    }
}
