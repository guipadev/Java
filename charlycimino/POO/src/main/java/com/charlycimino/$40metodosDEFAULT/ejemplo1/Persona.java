package com.charlycimino.$40metodosDEFAULT.ejemplo1;

public class Persona implements Identificable{

    private String DNI;

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public void mostrarIdentificacion() {
        System.out.println(this.DNI);
    }
}
