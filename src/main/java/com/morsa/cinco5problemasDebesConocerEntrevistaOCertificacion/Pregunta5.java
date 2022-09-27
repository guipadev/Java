package com.morsa.cinco5problemasDebesConocerEntrevistaOCertificacion;

import java.util.ArrayList;
import java.util.List;

public class Pregunta5 {

    public static void main(String[] args) {

        // ¿Qué lineas compilan correctamente?

        List<Rana> anfibios = crearRanas();
        //List<Anfibio> anfibio2 = crearRanas(); // para funcionar deberia utilizar generic, uso correcto linea 14
        List<? extends Rana> anfibio3 = crearRanas(); // Forma de aceptar un polimorfismo en generic, aceptando dicho tipo o sus hijos
        List<? extends Anfibio> anfibio4 = crearRanas(); // Acepta porque acepta lo que sea un anfibio o derivado de esto, uso generic
        // List<? extends RanaDeDarwin> anfibio5 = crearRanas(); // No se puede trabajar con elementos encapsulados
        // List<? extends Sapobledore> anfibio6 = crearRanas(); // No se puede trabajar con elementos encapsulados

        // anfibio4 compila a media porque no todos los anfibios saltan y nadan como un pinguino
        // anfibio3 funciona porque solo se especifica a las ranas las cuales saltan y nadan
        anfibio3.forEach(anfibio -> {
            anfibio.nadar();
            anfibio.saltar();
        });
    }

    static List<Rana> crearRanas() {
        RanaDeDarwin rana1 = new RanaDeDarwin();
        Sapobledore rana2 = new Sapobledore();
        return new ArrayList<Rana>() { { add(rana1); add(rana2); } };
    }
}

interface Anfibio {
    default void nadar() {}
}

abstract class Rana implements Anfibio {
    void saltar() {}
}

class RanaDeDarwin extends Rana {}

class Sapobledore extends Rana {}
