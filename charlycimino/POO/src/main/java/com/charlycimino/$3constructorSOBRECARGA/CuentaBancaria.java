package com.charlycimino.$3constructorSOBRECARGA;

public class CuentaBancaria {

    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    // CONSTRUCTOR
    // Es bueno indicar que parametros se deben utilizar
    public CuentaBancaria(String alias, String moneda, String tipo) {
        // Se establecer los valores a traves de los setters que ya cuentan con validacion
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }

    // SOBRE CARGA DE CONSTRUCTORES
    public CuentaBancaria() {}

    // USO THIS SOBRE CARGA DE CONSTRUCTOR
    public CuentaBancaria(String moneda, String tipo) {

        this("ALIAS.POR.DEFECTO", moneda, tipo);
    }
    private String generarCBU() {

        return "121545625"; // Se deberia genera un # aleatorio
    }

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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
