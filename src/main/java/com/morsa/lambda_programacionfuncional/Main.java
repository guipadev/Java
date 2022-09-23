package com.morsa.lambda_programacionfuncional;

import java.util.Arrays;

/**
 * programación funcional: las Lambdas o también llamadas Funciones Anónimas.
 * En particular usaremos Java sin embargo las lambdas están presentes en la mayoría de los lenguajes
 * utilizados hoy en día.
 *
 * Aprender este concepto no solo te ayudará a entender mejor los programas de otras personas,
 * sino también a mejorar tu propio código.
 *
 * Beneficios:
 * Funciones como parametros
 * Reducción de código
 * Mejora la lectura
 *
 * Ejemplo Reduce:
 *
 * main () {
 *     int[] numeros = new int[] {1,2,3,4,5,6,9,8,9};
 *     int sumaTotal = numeros.reduce(a, b -> a + b, 0);
 *     int multiplicacionTotal = numeros.reduce(a, b -> a * b, 1);
 * }
 *
 * ¿Què tipo tiene una lambda?
 * Interfaz se puede implementar lambda, ya que se construyen con un solo metodo
 *
 * interface Operacion {
 *     int aplicar(int numero1, int numero2);
 * }
 *
 */

public class Main {

    /**
     * Se va agarrando elemento por elemento y aplica una operacion que recibimos en el metodo
     * a lo que llevo acumulado de todo lo que he recorrido
     * Osea si tenemos un arreglo de 10 elementos, voy a empezar a reducir el primer elemento
     * del arreglo con el valor inicial y de esa el valor inicial y el primer elemento saco un tercer elemento
     * que es el nuevo valor acumulado, posterior se usa una variable para acumular el resultado y luego esta
     * acumulacion se aplica al siguiente elemento del arreglo y aplico la reduccion nuevamente y se va a opoerando
     * hasta que termine el arreglo
     */
    static int reducir(int[] numeros, operacionDeDosNumeros operacion, int inicial) {

        int acumulador = inicial;

        // Usar el FOR para recorrer el arreglo no es una forma funcional de resolver e implementar el metodo reducir
        // el cual es altamente funcional, lo mejor es aplicar una forma recursiva o metodo funcional

        for (int numero : numeros)  {
            acumulador = operacion.aplicar(numero, acumulador);
        }

        return acumulador;
    }

    public static void main(String[] args) {

        int[] numeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // sumatoria numeros
        int sumaTotal = reducir(numeros, (a, b) ->
        {
            System.out.println(a + b);
            return a + b;
        }, 0);

        System.out.println("La suma total es " + sumaTotal);

        // multiplicacion numeros
        int multiplicacionTotal = reducir(numeros, (a, b) -> a * b, 1);

        System.out.println("La multiplicacion de los numeros es " + multiplicacionTotal);

        // Metodo reducir de Java
        int sumaTotalJava = Arrays.stream(numeros).reduce(0, (a, b) -> a + b);

        System.out.println("La suma total verion Java es " + sumaTotalJava);


    }
}
