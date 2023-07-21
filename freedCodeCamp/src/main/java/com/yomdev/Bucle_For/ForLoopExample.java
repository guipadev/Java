package com.yomdev.Bucle_For;

/**
 * Puede usar bucles en la programación para llevar a cabo un conjunto de instrucciones repetidamente
 * hasta que se cumpla una determinada condición.
 *
 * Hay tres tipos de bucles en Java:
 *
 * for bucle.
 * while bucle.
 * do...while bucle.
 *
 * Nos centraremos en el for ciclo, su sintaxis y algunos ejemplos para ayudarlo a usarlo en su código.
 *
 * El for ciclo se usa principalmente cuando se sabe la cantidad de veces que se espera que se ejecute
 * un ciclo antes de detenerse.
 *
 * Java para la sintaxis del bucle
 *
 * Así es for como se ve la sintaxis de loop en Java:
 *
 * for (initialization; condition; increment/decrement) {
 *    // code to be executed
 * }
 *
 * En la sintaxis anterior:
 *
 * la inicialización denota una variable inicial declarada en el punto de inicio del ciclo,
 * generalmente un número entero.
 * condition indica el número de veces que se supone que debe ejecutarse el ciclo.
 * increment/decrement aumenta/disminuye el valor de la variable inicial cada vez que se ejecuta
 * el ciclo.
 * A medida que ocurre el incremento/decremento, el valor de la variable tiende hacia la condición
 * especificada.
 */
public class ForLoopExample {

    public static void main(String[] args) {

        System.out.println("Ejemplo de bucle for de Java n.º 1");

        /**
         * usamos un for bucle para imprimir números del 1 al 10.
         *
         * pero como funciona? Echa un vistazo a las condiciones dadas: (int x = 1; x <=10; x++).
         *
         * Al principio, x se estableció en 1.
         *
         * La segunda condición — x <=10 —
         * indica que se espera que el ciclo se ejecute siempre que el valor de xsea menor o igual a 10.
         *
         * La tercera condición — x++ —
         * aumenta el valor de xcada vez que se ejecuta el bucle.
         *
         * El ciclo luego imprime el valor de x cada vez que se incrementa.
         */

        for(int x = 1; x <=10; x++) {
            System.out.println(x);
            // 1
            // 2
            // 3
            // 4
            // 5
            // 6
            // 7
            // 8
            // 9
            // 10
        }

        System.out.println("Ejemplo #2 de Java For Loop");

        // En este ejemplo, aprenderá a imprimir todos los valores almacenados en una matriz.

        int[] oddNumbers = {1, 3, 5, 7};

        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
            // 1
            // 3
            // 5
            // 7
        }

        /**
         * Las condiciones en el código anterior son un poco diferentes en comparación con el
         * primer ejemplo, pero la lógica es la misma.
         *
         * i tiene un valor inicial de 0 porque el índice de una matriz en Java comienza en 0.
         * El primer elemento es 0, el segundo es 1, y así sucesivamente.
         *
         * i < oddNumbers.length significa que se espera que el código se ejecute siempre que el valor
         * de i sea menor que la longitud de la matriz.
         * La longitud de la matriz es 4, por lo que significa i < 4.
         *
         * i++ aumenta el valor de icada vez que se ejecuta el código hasta que la condición i < 4
         * es false.
         *
         * El código imprime 1, 3, 5, 7 en la consola.
         *
         * Sin un bucle, lograría el mismo resultado haciendo algo como esto:
         */

        System.out.println(oddNumbers[0]); // 1
        System.out.println(oddNumbers[1]); // 3
        System.out.println(oddNumbers[2]); // 5
        System.out.println(oddNumbers[3]); // 7

        /**
         * Imagina tener una matriz con 100 elementos.
         * Tendría que escribir cien println métodos para imprimirlos todos.
         *
         * Con un bucle, puedes lograrlo con una línea de código.
         */
    }
}
