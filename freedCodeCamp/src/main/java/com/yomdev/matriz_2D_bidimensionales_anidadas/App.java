package com.yomdev.matriz_2D_bidimensionales_anidadas;

/**
 * Una matriz multidimensional es simplemente una matriz de matrices.
 * Puede verlo como un solo contenedor que almacena varios contenedores.
 */
public class App {

    public static void main(String[] args) {

        /**
         * Cómo declarar una matriz bidimensional en Java
         * Para crear una matriz bidimensional en Java, debe especificar el tipo de datos de los elementos
         * que se almacenarán en la matriz, seguido de dos corchetes y el nombre de la matriz.
         *
         * data_type[][] array_name;
         */

        int[][] oddNumbers = { {1, 3, 5, 7}, {9, 11, 13, 15} };

        /**
         * Cómo acceder a elementos en una matriz bidimensional en Java
         * Podemos acceder a elementos en dos dimensiones usando dos corchetes.
         * El primero indica la matriz desde la que queremos acceder a los elementos,
         * mientras que el segundo indica el índice del elemento al que queremos acceder.
         */

        System.out.println(oddNumbers[0][0]); // 1

        /**
         * En el ejemplo anterior, tenemos dos matrices en la oddNumbersmatriz: {1, 3, 5, 7} y {9, 11, 13, 15}.
         *
         * La primera matriz — {1, 3, 5, 7} — se denota con 0.
         *
         * La segunda matriz — {9, 11, 13, 15} — se denota con 1.
         *
         * La primera matriz es 0, la segunda es 1, la tercera es 2, y así sucesivamente.
         *
         * Entonces, para acceder a un elemento de la primera matriz, asignamos 0 al primer corchete.
         * Como estábamos tratando de acceder al primer elemento de la matriz, usamos su índice,
         * que es cero: oddNumbers[0][0].
         */

        /**
         * Entonces, digamos que queremos acceder a un elemento en la segunda matriz que se denota con 1,
         * nuestro código se verá así: oddNumbers[1][?].
         *
         * Ahora que estamos en la segunda matriz ( {9, 11, 13, 15}), intentemos acceder a un elemento en ella.
         * Al igual que las matrices regulares, cada elemento tiene un índice que comienza desde cero.
         *
         * Entonces, para acceder 13 a cuál es el tercer elemento, pasamos su número de índice al segundo corchete:
         * oddNumbers[1][2].
         */

        int[][] oddNumbers2 = { {1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23} };

        /**
         * El objetivo aquí es acceder a 21 en la tercera matriz.
         * Nuestro código de acceso todavía tiene signos de interrogación: oddNumbers[?][?].
         *
         * Comenzaremos dando al primer signo de interrogación un valor que apunte a la matriz particular para acceder.
         *
         * Matriz 0 => {1, 3, 5, 7}
         * Matriz 1 => {9, 11, 13, 15}
         * Matriz 2 => {17, 19, 21, 23}
         *
         * El número que estamos buscando está en la tercera matriz con un índice de matriz de 2.
         * Así que hemos encontrado el valor del primer corchete:oddNumbers[2][?]
         *
         * El valor del segundo corchete apuntará al elemento real al que se accederá.
         * Para hacer eso, tenemos que especificar el número de índice del elemento.
         * Aquí están los índices en esa matriz:
         *
         * 17 => Índice 0
         * 19 => Índice 1
         * 21 => Índice 2
         * 23 => Índice 3
         *
         * 21 tiene un índice de 2, así que podemos continuar y agregarlo al segundo corchete: oddNumbers[2][2].
         * Cuando imprima eso en la consola, obtendrá 21 impresos.
         */

        System.out.println(oddNumbers2[2][2]); //21

        /**
         * Puede recorrer todos los elementos en una matriz bidimensional mediante un bucle anidado.
         * Aquí hay un ejemplo:
         */
        for(int i = 0; i < oddNumbers2.length; i++){
            for(int j = 0; j < oddNumbers2[i].length; j++){
                System.out.println(oddNumbers2[i][j]); // 1 3 5 7 9 11 13 15 17 19 21 23
            }
        }

    }
}
