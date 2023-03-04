package com.pildo._11interfaces;


import java.util.Date;
import java.util.GregorianCalendar;

// Incluir el metodo comparable al implementarla
public class Empleado implements Comparable, Trabajadores {

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int IdSiguiente = 1;
    private int Id;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendarrio = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendarrio.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    public Empleado(String nom) {
        this(nom, 30000,2000,01,01);
    }

    // Getter
    public String dameNombre() {
        return nombre + " Id: " + Id;
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

    // metodo obligatorio por implementacion comparable
    @Override
    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;

        if(this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }

        if(this.sueldo > otroEmpleado.sueldo) {
            return 1;
        }

        return 0;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        return Trabajadores.bonusBase + gratificacion;
    }
}