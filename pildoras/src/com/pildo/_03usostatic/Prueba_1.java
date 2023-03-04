package com.pildo._03usostatic;

public class Prueba {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Linda");

        trabajador1.cambiSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
    }
}

class  Empleados {

    // final para que se vuelva la variable en constante y no cambie de valor
    private final String nombre;
    private String seccion;
    public int Id;
    // static variable compartida por todo los objetos creados
    private static int IdSiguiente = 1;

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    // Setter
    public void cambiSeccion(String seccion) {
        this.seccion = seccion;
    }


    // Getter
    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la sección es " + seccion + " y el Id=" + Id;
    }
}