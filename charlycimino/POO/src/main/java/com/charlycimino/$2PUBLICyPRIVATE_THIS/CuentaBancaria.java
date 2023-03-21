package com.charlycimino.$2PUBLICyPRIVATE_THIS;

// Debes analizar los getters y setters que en verdad necesitamos
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;

    public void mostrarDatos () {
        System.out.println(CBU + " " + alias + " " + saldo);
    }

    public String getCBU() {
        return CBU;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto; // saldo += monto
        }
    }

    private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    public void extraer (double monto) {
        if (saldoDisponible(monto)) {
            saldo = saldo - monto; // saldo -= monto
        }
    }
}
