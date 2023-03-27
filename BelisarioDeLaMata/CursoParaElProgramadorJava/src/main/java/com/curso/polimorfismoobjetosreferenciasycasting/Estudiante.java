package com.curso.polimorfismoobjetosreferenciasycasting;


public class Estudiante extends Persona implements IActividad {
    
    private String idEstudiante;

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
    

    @Override
    public void subir() {
        System.out.println("Estudiante Subir Actividad");
    }
    
    @Override
    public void comer() {
        System.out.println("Estudiante Comer");
    }
}
