package com.charlycimino.$33ABSTRACTMETODOSabstractos;

public class Rectangulo extends  FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }
}
