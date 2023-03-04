package com.pildo._07polimorfismoyenlazadodinamico;

public class Main {

    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[6];

        Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006,9,25);

        jefeRRHH.estableceIncentivo(2570);

        misEmpleados[0] = new Empleado("Ana", 3000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        //polimorfismo: principio sustitucion
        misEmpleados[4] = jefeRRHH;

        misEmpleados[5] = new Jefatura("Marly",95000,1999,5,26);
        //Casting de objetos
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];

        jefaFinanzas.estableceIncentivo(55000);

        //Si nos fijamos en el resultado de salarios, no se tiene en cuenta por defecto
        //Ya que en los datos de jefatura cambian, de acuerdo al metodo que llama

        //Enlado dinamico ya que la JVM en tiempo de ejecucion que metodo debe ejecutar 
        //pertenciente a la clase padre o subclase
        for (Empleado aumento : misEmpleados) {
            aumento.subeSueldo(5);
        }

        for (Empleado datos : misEmpleados) {
            System.out.println("Nombre: " + datos.dameNombre() + " Sueldo: " + datos.dameSueldo() + " Fecha Alta: " + datos.dameFechaContrato());
        }

    }

}


