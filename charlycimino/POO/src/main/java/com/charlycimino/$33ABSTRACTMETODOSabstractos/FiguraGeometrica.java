package com.charlycimino.$33ABSTRACTMETODOSabstractos;

/**
 * Al tener un metodo abstracto la clase debe ser abstracta
 * estas clases no se pueden instanciar
 * Recordar una clase puede ser abstracta sin necesidad de que contenga o herede metodos abstractos
 */
public abstract class FiguraGeometrica {

    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    /**
     * Se convierte en metodo abstracto
     * public double perimetro() { return 0; }
     */
    public abstract double perimetro();
}
