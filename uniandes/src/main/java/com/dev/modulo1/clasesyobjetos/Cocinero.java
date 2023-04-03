package com.dev.modulo1.clasesyobjetos;

import java.util.ArrayList;

public class Cocinero {
    private ArrayList<Pizza> pizzas;

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

    /**
     * ALGORITMO DE ORDENAMIENTO POR INSERCIÓN
     * 1. Definir una parte ordenada
     * 2. Tomar el primero de la parte desornada
     * 3. Agregarlo ordenadamente en la parte ordinaria
     * 4. Repetir hasta ordenar todos
     */
    public void ordenarPizzaPorPrecio() {
        for (int i = 1;  i < pizzas.size(); i++) {

            boolean agregado = false;

            for (int j = i; j > 0 && !agregado; j++) {
                Pizza uno = pizzas.get(j);
                Pizza dos = pizzas.get(j - 1);
                if (uno.darPrecio() < dos.darPrecio()) {
                    pizzas.set(j, dos);
                    pizzas.set(j - 1, uno);
                } else {
                    agregado = true;
                }
            }
        }
    }

    /**
     * ALGORITMO DE ORDENAMIENTO POR SELECCIÓN
     * 1. Definir una parte ordenada
     * 2. Buscar el menor (o mayor) de la parte desordenada
     * 3. Intercambiarlo con el primero de la parte desornada
     * 4. Repetir hasta ordenar todos
     *
     * Ordenar las pizzas de un cocinero según su precio
     * de producción de menor a mayor
     *
    public void ordenarPizzaPorPrecioProduccion() {
        for (int i = 0;  i < pizzas.size() - 1; i++) {
            int menor = pizzas.get(i);
            int posMenor = i;

            for (int j = i + 1; j < pizzas.size(); j++) {
                Pizza actual = pizzas.get(j);
                if (actual.darPrecio() < menor.darPrecio()) {
                    menor = actual.darCantidadProducida();
                    posMenor = j;
                }
            }
            Pizza temp = pizzas.get(i);
            pizzas.set(i, menor);
            pizzas.set(posMenor, temp);
        }
    }*/

}
