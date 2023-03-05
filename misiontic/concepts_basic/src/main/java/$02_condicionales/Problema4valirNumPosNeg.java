/*
Dado un número real x, construya una función que permita
determinar si el número es positivo, negativo o cero. Para cada caso
de debe imprimir el texto que se especifica a continuación:
Positivo: “El número x es positivo”
Negativo: “El número x es negativo”
Cero (0): “El número x es el neutro para la suma”
 */
package $02_condicionales;

import java.util.Scanner;

public class Problema4valirNumPosNeg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número real: ");

        // Número real de prueba
        double x = sc.nextDouble(); // -5.6


        // Llama a la función determinarSignoNumero con el número de prueba
        determinarSignoNumero(x);
    }

    public static void determinarSignoNumero(double numero) {

        // Verifica si el número es positivo
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) { // Verifica si el número es negativo
            System.out.println("El número " + numero + " es negativo.");
        } else { // El número es igual a cero
            System.out.println("El número " + numero + " es el neutro para la suma.");
        }
    }
}
