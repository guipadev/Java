package com.yomdev.Array_invertir_matriz_orden_asc_o_desc;

// importar la Arrays clase. Esto nos da acceso a todos los métodos.
import java.util.Arrays;
// importamos las clases Arrays y Collections
import java.util.Collections;

public class App {

    /**
     * En Java, usa matrices para almacenar una colección de variables
     * (con el mismo tipo de datos) en una sola variable.
     *
     * En muchos casos, los valores almacenados en una matriz aparecen en orden aleatorio.
     * Usando la Arrays clase en Java, tiene acceso a varios métodos que puede usar para manipular
     * matrices.
     *
     * Uno de los métodos que usaremos de la Arrays clase es el sort() método que ordena una matriz
     * en orden ascendente.
     *
     * También veremos cómo ordenar una matriz en orden descendente usando el reverseOrder() método
     * de la Collections clase en Java.
     * @param args
     */
    public static void main(String[] args) {

        // Cómo ordenar una matriz en orden ascendente en Java usando Arrays.sort()

        // creamos una matriz con números en un orden aleatorio
        int[] arr = { 5, 2, 1, 8, 10 };

        // ordenar esta matriz en orden ascendente, pasamos la matriz como parámetro al sort() método
        // Tenga en cuenta que la Arrays clase se escribió primero antes de acceder al sort() método
        // mediante la notación de puntos.
        Arrays.sort(arr);

        // recorrimos e imprimimos la matriz en la consola.
        // El resultado fue una matriz ordenada
        for (int values : arr) {
            System.out.print(values + ", "); // 1, 2, 5, 8, 10,
        }

        System.out.println();

        /**
         * Cómo ordenar una matriz en orden descendente en Java usando Collections.reverseOrder()
         * Para ordenar una matriz en orden descendente, usamos el reverseOrder() que podemos acceder
         * desde la Collections clase.
         *
         * Todavía usaremos Arrays.sort(); pero en este ejemplo, tomará dos parámetros:
         * la matriz que se ordenará y Collections.reverseOrder().
         */

        /**
         *  creamos una matriz de números en orden aleatorio:
         *  Notarás que usamos Integer[] en lugar de int[] como lo hicimos en el último ejemplo;
         *  este último generaría un error.
         */
        Integer[] arreglo = { 5, 2, 1, 8, 10 };

        /**
         * Para ordenar la matriz en orden descendente, hicimos esto:
         * El primer parámetro es la matriz arreglo que se ordenará en orden ascendente.
         * El segundo parámetro - Collections.reverseOrder() - invertirá el orden de la matriz ordenada
         * para que se organice en orden descendente.
         */
        Arrays.sort(arreglo, Collections.reverseOrder());

        for (int values : arreglo) {
            System.out.print(values + ", "); // 10, 8, 5, 2, 1,
        }
    }
}
