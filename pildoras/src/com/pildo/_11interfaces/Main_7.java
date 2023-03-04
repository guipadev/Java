package com.pildo._11interfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[6];

        Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006,9,25);

        jefeRRHH.estableceIncentivo(2570);

        misEmpleados[0] = new Empleado("Ana", 3000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);

        misEmpleados[4] = jefeRRHH;

        misEmpleados[5] = new Jefatura("Marly",95000,1999,5,26);

        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];

        jefaFinanzas.estableceIncentivo(55000);

        /* Uso instanceof
        Empleado directorComercial = new Jefatura("Sandra", 85000, 2012,05,05);

        // No se puede instanciar directamente una interfaz, pero utilizando el principio de sustitucion
        Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011,06,07);

        // Comprobar si instacia pertenece a una clase
        if (directorComercial instanceof Empleado) {
            System.out.println("Es de tipo Jefatura");
        }

        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }
        */

        System.out.println(jefaFinanzas.tomarDecisiones("Dar más dias de vacaciones a los empleados"));

        // dar bono
        System.out.println("El jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de: " + jefaFinanzas.estableceBonus(500));

        System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));

        for (Empleado aumento : misEmpleados) {
            aumento.subeSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for (Empleado datos : misEmpleados) {
            System.out.println("Nombre: " + datos.dameNombre() + " Sueldo: " + datos.dameSueldo() + " Fecha Alta: " + datos.dameFechaContrato());
        }

    }
}
