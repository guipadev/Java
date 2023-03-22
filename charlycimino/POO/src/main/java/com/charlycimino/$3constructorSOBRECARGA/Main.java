package com.charlycimino.$3constructorSOBRECARGA;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria("Batman", "COP", "Ahorros");
        CuentaBancaria cb2 = new CuentaBancaria("EURO", "CDT");

        cb.mostrarDatos();

        cb2.mostrarDatos();
    }
}
