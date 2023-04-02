package com.dev.modulo2.arreglosyvectores;

public class Pizza {

    private double costoDeProduccion;

    private String nombre;

    private int cantidadProducida;

    private double precioDeVenta;

    public int darCantidadProducidas() {
        return cantidadProducida;
    }

    public void modificarPrecioVenta(double nuevoPrecio) {
        precioDeVenta = nuevoPrecio;
    }

    public double darGananciaUnitaria() {
        return precioDeVenta;
    }

    public String darNombre() {
        return nombre;
    }

    public double darPrecioVenta() {
        return precioDeVenta;
    }
}
