package com.charlycimino.$36EJERCICIOPOOMETODOSABSTRACTOS;

public class EmpleadoSalarioFijo extends Empleado{

    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int ANIO1 = 2;
    private static final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double sb) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sb;
    }

    private double porcAdicional() {

        int tiempoLaboral = antiguedadEnAnios();
        double porcentaje = 0;

        if (tiempoLaboral > ANIO2) {
            porcentaje = PORC2;
        } else if (tiempoLaboral >= ANIO1) {
            porcentaje = PORC1;
        }
        return porcentaje;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + sueldoBasico * porcAdicional(   );
    }
}
