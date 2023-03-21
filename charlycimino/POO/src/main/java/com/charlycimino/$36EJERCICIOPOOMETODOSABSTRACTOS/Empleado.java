package com.charlycimino.$36EJERCICIOPOOMETODOSABSTRACTOS;

import java.time.LocalDate;

public abstract class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int antiguedadEnAnios() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }

    // Si utilizaramos un Setter y Getter para solicitar nombre y apellido
    // No estariamos aplicando el principio del donas (lograr que los objetos responda  a cierta logica y no estar haciendola en otro lado)
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public abstract double getSalario();
}
