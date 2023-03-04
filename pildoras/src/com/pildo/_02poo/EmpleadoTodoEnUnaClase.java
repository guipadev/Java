package com.pildo._02poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmpleadoTodoEnUnaClase {

    public static void main(String[] args) {

        /*
        Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
        Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha Alta: " + empleado1.dameFechaContrato());
        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha Alta: " + empleado2.dameFechaContrato());
        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha Alta: " + empleado3.dameFechaContrato());
        */

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);

        /*
        for (int i=0; i<3; i++) {
            misEmpleados[i].subeSueldo(5);
        }
         */

        for (Empleado aumento : misEmpleados) {
            aumento.subeSueldo(5);
        }

        /*
        for (int i=0; i<3; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha Alta: " + misEmpleados[i].dameFechaContrato() );
        }
         */

        for (Empleado datos : misEmpleados) {
            System.out.println("Nombre: " + datos.dameNombre() + " Sueldo: " + datos.dameSueldo() + " Fecha Alta: " + datos.dameFechaContrato());
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