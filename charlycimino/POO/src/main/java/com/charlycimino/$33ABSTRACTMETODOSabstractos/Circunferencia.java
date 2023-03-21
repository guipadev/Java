package com.charlycimino.$33ABSTRACTMETODOSabstractos;

public class Circunferencia extends FiguraGeometrica {

    private double radio;

    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * this.radio * Math.PI;
    }
}
