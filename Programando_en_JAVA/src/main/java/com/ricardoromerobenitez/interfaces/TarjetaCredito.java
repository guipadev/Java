package com.ricardoromerobenitez.interfaces;

import java.math.BigDecimal;

public class TarjetaCredito implements Pago{

    @Override
    public void crearPago() {
        System.out.println("Pago con tarjeta credito");
    }

    @Override
    public String tipoPago() {
        return "Credito a cuotas";
    }

    public BigDecimal totalPrecio() {
        return BigDecimal.TEN;
    }
}
