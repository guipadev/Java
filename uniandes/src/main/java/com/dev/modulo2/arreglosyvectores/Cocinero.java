package com.dev.modulo2.arreglosyvectores;

import java.util.ArrayList;

public class Cocinero {

    /**
     * ARREGLOS ID (TAMAÑO VARIABLE)
     * ArrayList -> Clase de Java que permite modelar un colecciones de tamaño variable
     * - Crecer a medida que se agregar elementos
     * - Reduce su tamaño a medida que se eliminan los elementos
     *
     * Algunos métodos de la clase ArrayList
     * get(post) -> Devuelve el elemento de la posición pos
     * add(obj) -> Agrega el objeto al final del arreglo
     * add(pos, obj) -> Agrega el objeto obj a las posición pos
     * size() -> Devuelve la cantidad de elementos almacenados en el arreglo
     * remove(pos) -> Elimina el objeto de la posición pos (y desplaza los demás para no dejar espacios)
     */
    private ArrayList <Pizza> pizzas;

    public Cocinero() {
        pizzas = new ArrayList<Pizza>();
    }

    public int darCantidadProducida() {
        return 0;
    }

    /**
     * 7) BÚSQUEDAS SECUENCIALES
     * Definir una o varia características de búsqueda
     * Recorrer el element por elemento el arreglo
     * Detenerse una vez encontrado el elemento buscado, puede ser necesario revisar todos
     */
    // ¿Un cocinero prepara una pizza de cierto nombre?
    public boolean preparaPizza(String nombre) {

        boolean laPrepara = false;

        for (int i = 0; i < pizzas.size() && !laPrepara; i++) {

            Pizza actual = pizzas.get(i);

            if (actual.darNombre().equals(nombre))
                laPrepara = true;
        }

        return laPrepara;
    }


    //¿Cuál es la pizza más barata que sabe hacer un cocinero?
    public Pizza darPizzaMasBarata() {

        Pizza menor = null;

        for (int i = 0; i < pizzas.size(); i++) {

            Pizza actual = pizzas.get(i);

            if (menor == null)
                menor = actual;
            else if (menor != null && menor.darPrecioVenta() > actual.darPrecioVenta())
                menor = actual;
        }
        return menor;
    }

    /**
     * 8) BÚSQUEDA BINARIA
     * Solo funciona si los elementos están ordenados por el criterio de búsqueda
     * Revisar el elemento del medio:
     * - Si es el buscado -> Terminar
     * - No es el buscado -> Descartar la mitad de los elementos
     * Repetir hasta que no haya elementos
     */
    //¿Un cocineor prepara una pizza de cierto nombre?
    public boolean preparaPizzaBinaria(String nombre) {

        boolean laPrepara = false;
        int inicio = 0;
        int fin = pizzas.size() - 1;

        while (!laPrepara && inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Pizza central = pizzas.get(medio);
            int compara = central.darNombre().compareTo(nombre);

            if (compara == 0)
                laPrepara = true;
            else if (compara > 0)
                fin = medio - 1;
            else
                inicio = medio + 1;
        }

        return laPrepara;
    }

}
