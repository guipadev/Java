package com.dev.modulo1.clasesyobjetos;

public class Cocinero {

    private String nombre;

    /**
     * ASOCIACIONES
     * Permiten modelar las relaciones que existen entre las clases
     */
    private Pizza pizza_1;
    private Pizza pizza_2;

    /**
     * CREACIÓN DE OBJETOS
     * Instrucción new (Llamado de métodos constructores)
     */
    public Cocinero() {
        pizza_1 = new Pizza("Carnes", 120000.0, 250000.0);
    }

    /**
     * LLAMADO DE MÉTODOS
     * ¿Cuándo utilizar (llamar) un método?
     * Una clase necesita un cálculo realizado en otro método de LA MISMA clase
     * Una clase necesita un cálculo realizado en un método de OTRA clase
     * El operador punt (.) permite acceder a los miembros de una clase (atributos y métodos publicos)
     */
    public int darUnidadesProducidas() {
        return pizza_1.darCantidadProducida() + pizza_2.darCantidadProducida();
    }

}
