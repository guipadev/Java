package com.pildo._05sobrecargadeconstructores;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);

        misEmpleados[2] = new Empleado("Jose");

        for(Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }

        for (Empleado e : misEmpleados) {
            System.out.println(
                    "Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha Alta: " + e.dameFechaContrato()
            );
        }
    }
}

class Empleado {

    private String nombre;
    private double sueldo;

    private Date altaContrato;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendarrio = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendarrio.getTime();
    }

    // Sobre carga constructor - La cantidad de parametros debe ser diferentes
    // Dar diferentes estados iniciales
    //public Empleado(String nom) {
    //    nombre = nom;
    //}
    public Empleado(String nom) {
        //this llama al otro constructor de la clase, y si ubieran muchos va a llamar
    	//al que coincida con el numero de parametros
        this(nom, 3000, 2000,01,03);
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
