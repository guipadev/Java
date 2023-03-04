package com.pildo._01basico.constanteusofinal;

public class Prueba {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");

        trabajador1.cambiSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }
}

class  Empleados {

	
    // final para que se vuelva la variable en constante y no cambie de valor
    private final String nombre;
    private String seccion;

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
    }

    // Setter
    public void cambiSeccion(String seccion) {
        this.seccion = seccion;
    }


    // Getter
    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la sección es " + seccion;
    }
}