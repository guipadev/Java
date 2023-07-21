package com.yomdev.Bucle_ForEach_en_matrices;

/**
 * Puede utilizar bucles mejorados en Java para lograr los mismos resultados que un for bucle.
 * Un bucle mejorado también se conoce como for-each bucle en Java.
 *
 * Los bucles mejorados simplifican la forma de crear for bucles.
 * Se utilizan principalmente para iterar a través de una matriz o colección de variables.
 */
public class ForEachExample {

    /**
     * Sintaxis de bucle for-each de Java
     * Así es como for-each se ve la sintaxis de un bucle en Java:
     *
     * for(dataType variable : array) {
     *     // code to be executed
     * }
     *
     * En la sintaxis anterior:
     *
     * dataType denota el tipo de datos de la matriz.
     * variable denota una variable asignada a cada elemento de la matriz durante la iteración
     * (comprenderá esto a través de los ejemplos que siguen).
     * matriz denota la matriz que se va a recorrer.
     */
    public static void main(String[] args) {

        // creamos una matriz llamada even_numbers
        int[] even_numbers = { 2, 4, 6, 8 };

        // Para recorrer e imprimir todos los números en la matriz, usamos un for-each ciclo
        // En el paréntesis del ciclo, creamos una variable entera llamada number que se usaría para recorrer la even_numbersmatriz

        for(int number : even_numbers){

            /**
             * Iteración #1
             * number= primer elemento de la matriz (2). Esto se imprime.
             *
             * Iteración #2
             * number= segundo elemento en la matriz (4). Este valor actual se imprime.
             *
             * Iteración #3
             * number= tercer elemento en la matriz (6). Este valor actual se imprime.
             *
             * Iteración #4
             * number= cuarto elemento en la matriz (8). Este valor actual se imprime.
             */

            System.out.println(number);
            // 2
            // 4
            // 6
            // 8
        }

        /**
         * El valor de number sigue cambiando al índice actual durante el proceso de iteración
         * hasta que llega al final de la matriz.
         * Después de imprimir cada índice, pasa al siguiente índice.
         *
         * También puede verlo de esta manera:
         * "Para cada number en la even_numbersmatriz, imprima number)".
         */

        int[] numeros = { 2, 4, 6, 8 };

        System.out.println("Java For-Each Bucle Ejemplo #2");

        // Estamos multiplicando el valor de cada elemento por dos usando la number variable:
        // number = number * 2;

        for(int num : numeros){
            num = num * 2;
            System.out.println(num);
        }
    }

    /**
     * Resumen
     * Puede usar for-each bucles en Java para iterar a través de elementos de una matriz o colección.
     *
     * Simplifican la forma de crear for bucles. }
     * Por ejemplo, la sintaxis de un for ciclo requiere que cree una variable,
     * una condición que especifique cuándo debe terminar el ciclo y un valor de incremento/decremento.
     *
     * Con for-each los bucles, todo lo que necesita es una variable y la matriz que se va a recorrer.
     *
     * Pero esto no significa que siempre debas buscar for-each bucles.
     *
     * for los bucles le brindan más control sobre lo que sucede durante el proceso de iteración,
     * controlando y rastreando lo que sucede en cada índice o en algunos índices.
     *
     * Por otro lado, for-each los bucles se pueden usar cuando no tiene uso para rastrear cada índice.
     * El código simplemente se ejecuta para cada elemento de la matriz.
     */
}
