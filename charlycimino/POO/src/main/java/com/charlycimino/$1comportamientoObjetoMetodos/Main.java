package com.charlycimino.$1comportamientoObjetoMetodos;

public class Main {

    public static void main(String[] args) {

        // Crear objeto
        CuentaBancaria cb = new CuentaBancaria();

        // Mostrar cta
        System.out.println("Datos cuenta sin crear:");
        cb.mostrarDatos();

        cb.CBU = "255564454545415132";
        cb.alias = "miCuenta";
        System.out.println("Nuevos datos cuenta: ");
        cb.mostrarDatos();

        // Obtener saldo
        System.out.println("Saldo disponible: " + cb.obtenerSaldo());
        cb.depositar(200);
        System.out.println("Nuevo saldo: " + cb.obtenerSaldo());

        // Saldo cta
        System.out.println("saldo disponible:");
        System.out.println(cb.saldoDisponible(100));

        // Extraer cta
        System.out.println("saldo actual:");
        cb.extraer(180);
        System.out.println(cb.obtenerSaldo());
    }
}
