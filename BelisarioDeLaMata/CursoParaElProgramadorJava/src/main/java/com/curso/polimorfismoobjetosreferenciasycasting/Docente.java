package com.curso.polimorfismoobjetosreferenciasycasting;

public class Docente extends Persona implements IComite, IActividad {
    
  
    @Override
    public void subir() {
        System.out.println("Docente Subir Actividad");
    }

    @Override
    public void asisitr() {
        System.out.println("Docente Asistir");
    }
}
