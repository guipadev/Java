package com.charlycimino.$4sobrecargaMETODOS;

public class Robot {
    private String nombre;

    public Robot(String nombre) {

        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    public void saludar(String nombrePersona) {

        System.out.println("Hola " + nombrePersona + ", soy " + nombre);
    }

    // SOBRE CARGA CONSTRUCTOR las veces que queramos siempre y cuando sean diferentes los parametors o posiciones de estos
    //public void saludar() {
    //    System.out.println("Hola extraño, soy " + nombre);
    //}
    // Mejoramos la no duplicidad en este metodo
    public void saludar() {
        saludar("Hola extraño");
    }
}
