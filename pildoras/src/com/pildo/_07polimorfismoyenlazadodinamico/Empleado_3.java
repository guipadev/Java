package com.pildo._07polimorfismoyenlazadodinamico;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    
    private double sueldo;

    private Date altaContrato;
    

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendarrio = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendarrio.getTime();
    }

    // Getter
    public String dameNombre() {
        return nombre;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altaContrato;
    }

    // Setter
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }
}
