package com.charlycimino.$33ABSTRACTMETODOSabstractos;

import lombok.extern.java.Log;

import java.util.ArrayList;

@Log
public class Main {

    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Rectangulo("verde", 2, 2));
        figuras.add(new Circunferencia(1, "Rojo"));
        figuras.add(new Rectangulo("Amarillo", 1, 2));
        figuras.add(new Circunferencia(2, "Azul"));
        figuras.add(new TrianguloEquilatero("Negro", 4));

        for (FiguraGeometrica figura : figuras) {
            log.info(String.valueOf(figura.perimetro()));
        }
    }
}
