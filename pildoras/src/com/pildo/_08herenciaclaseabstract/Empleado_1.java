package com.pildo._08herenciaclaseabstract;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendarrio = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendarrio.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    @Override
    public String dameDescripcion()  {
        return "Este empleado tiene un Id: " + Id + " con un sueldo de: " + sueldo;
    }

    // Getter
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
