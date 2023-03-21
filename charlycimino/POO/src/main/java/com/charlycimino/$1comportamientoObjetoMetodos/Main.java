package com.charlycimino.$1comportamientoObjetoMetodos;

public class Main {

    public static void main(String[] args) {

        // Crear objeto
        CuentaBancaria cb = new CuentaBancaria();

        // Mostrar cta
        cb.mostrarDatos();
        cb.CBU = "255564454545415132";
        cb.alias = "miCuenta";
        cb.mostrarDatos();

        // Obtener saldo
        System.out.println(cb.obtenerSaldo());
        cb.depositar(200);
        System.out.println(cb.obtenerSaldo());

        // Saldo cta
        System.out.println(cb.saldoDisponible(100));

        // Extraer cta
        cb.extraer(180);
        System.out.println(cb.obtenerSaldo());
    }
}
