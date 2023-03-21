package com.yadevom.m_HERENCIA;

public class Moto extends Vehiculo {

    private boolean tieneTecho;

    public Moto(boolean tieneTecho, String color) {

        super(2, color, 2);
        this.tieneTecho = tieneTecho;
    }

    public boolean isTieneTecho() {
        return tieneTecho;
    }

    public void setTieneTecho(boolean tieneTecho) {
        this.tieneTecho = tieneTecho;
    }
}
