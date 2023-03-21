package com.charlycimino.$33ABSTRACTMETODOSabstractos;

public class TrianguloEquilatero extends FiguraGeometrica {

    private double lado;

    public TrianguloEquilatero(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }
}
