package com.charlycimino.$5toStringEstadoObjetos;

public class Persona {

    private String persona;
    private String apellido;
    private int edad;
    private boolean tieneHijos;

    public Persona(String persona, String apellido, int edad, boolean tieneHijos) {
        this.persona = persona;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }

    public String getPersona() {
        return persona;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "persona='" + persona + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", tieneHijos=" + tieneHijos +
                '}';
    }
}
