package com.yadevom.interfaz;

public class TarjetaDebito implements Pago{

    @Override
    public void crearPago() {
        System.out.println("Pago con tarjeta debito");
    }

    @Override
    public String tipoPago() {
        return "Debito cuenta ahorro inmediato";
    }
}
