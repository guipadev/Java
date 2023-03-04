package com.pildo._08herenciaclaseabstract;

public class Alumno extends Persona {

    private String carrera;

    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
    }

    @Override
    public String dameDescripcion() {
        return "Este alumno estudia la carrera de " + carrera;
    }
}
