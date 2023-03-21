package com.charlycimino.$36EJERCICIOPOOMETODOSABSTRACTOS;

public class EmpleadoAComision extends Empleado {

    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantClientesCaptados, double mpc) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = mpc;
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }

    @Override
    public double getSalario() {
        double sueldo = montoPorCliente * cantClientesCaptados;

        if (sueldo < salarioMinimo) {
            sueldo = salarioMinimo;
        }

        return sueldo;
    }
}
