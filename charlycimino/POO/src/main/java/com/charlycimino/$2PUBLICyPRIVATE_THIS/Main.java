package com.charlycimino.$2PUBLICyPRIVATE_THIS;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.setAlias("miNuevoAlias");
        cb.mostrarDatos();
        cb.setAlias(null);
        cb.mostrarDatos();

        String a = cb.getAlias();
        System.out.println(a);

    }
}
