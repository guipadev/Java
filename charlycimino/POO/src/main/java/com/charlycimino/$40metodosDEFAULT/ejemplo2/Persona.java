package com.charlycimino.$40metodosDEFAULT.ejemplo2;

public class Persona implements Empleado, Estudiante {

    /**
     * Como las implementaciones de los metodos son iguales, solo cambia el mensaje
     * debemos sobre escribir y elegir una implementacion de un interfaz en particular
     * empleado o estudiante
     */
    @Override
    public void realizarTarea() {
        Estudiante.super.realizarTarea();
        //Empleado.super.realizarTarea();
    }
}
