package com.yadevom.d_GENERICOS;

import java.util.List;

public class  Generico<TIPO> {

    private final TIPO tipoObjeto;

    public Generico(TIPO tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public void mostrar() {
        System.out.println("La clase generica 1: " +
                tipoObjeto.getClass().getName());
    }

}

// Generico tipo acotado el indica de que tipo exclusivo de clase
// que en este caso solo aceptara numeros
class Generico0<TIPO extends Number> {
    private final TIPO tipoNumero;

    public Generico0(TIPO tipoNumero) {
        this.tipoNumero = tipoNumero;
    }

    public void mostrar() {
        System.out.println("La clase generica 1: " +
                tipoNumero.getClass().getName());
    }
}

// Uso de los genericos solo en los metodos
class Generico2 {

    // El metodo tambien puede ser de tipo GENERICO
    public <TIPO> void mostrarGenerico(TIPO tipoObjeto) {
        System.out.println("la clase generica 2: " +
                tipoObjeto.getClass().getName());
    }
}

// Uso genericos para metodos con varios tipos
class Generico3 {

    // El metodo tambien puede ser de tipo GENERICO, pero retorna uno de sus tipos
    public <TIPO, SEGUNDO> SEGUNDO mostrarGenerico2(TIPO tipoObjeto, SEGUNDO tipoObj) {
        System.out.println("La clase generica 3: " +
                tipoObjeto.getClass().getName());

        return tipoObj;
    }
}

// Uso de GENERICO con los comodines(wildcards)
class Generico4 {

    // No sabremo el tipo lista, pero sabremos en este caso que debe ser un tipo numero ya que extiende
    public void mostrarGenerico3(List<? extends  Number> listica) {
        for (Number number : listica) {
            System.out.println("La clase generica 4: " +
                    number.getClass().getName());
        }
    }

}