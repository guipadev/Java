package com.charlycimino.$1comportamientoObjetoMetodos;

public class CuentaBancaria {

    String CBU;
    String alias;
    double saldo;

    void mostrarDatos () {
        System.out.println(this);
        System.out.println(CBU + " " + alias + " " + saldo);
    }

    double obtenerSaldo() {
        return saldo;
    }

    void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto; // saldo += monto
        }
    }

    boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    void extraer (double monto) {
        if (saldoDisponible(monto)) {
            saldo = saldo - monto; // saldo -= monto
        }
    }
}
