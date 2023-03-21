package com.charlycimino.$36EJERCICIOPOOMETODOSABSTRACTOS;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado emp : empleados) { //Uso polimorfismo en tiempo de ejecucion el lenguaje decide que vr se imprime en salario
            System.out.println(emp.nombreCompleto() + ": $" + emp.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        int max = -1;
        Empleado elMayor = null;

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision eac = (EmpleadoAComision) e;
                int cant = eac.getCantClientesCaptados();
                if (cant > max) {
                    max = cant;
                    elMayor = eac; // Da igual colocar 'e' ya que de forma implicita java hace el casteo
                }
            }
        }
        return elMayor;
    }

    public Empleado empleadosConMasClientes() {
        return null;
    }
}
