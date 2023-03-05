/*
Dada una cadena de longitud 1, determine si el código ASCII de
primera letra de la cadena es par o no.
 */
package $02_condicionales;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {

        // String cadena = ""; // Cadena vacía

        char primeraLetra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cadena ");

        String cadena = sc.next();

        try {
            // Obtiene la primera letra de la cadena
            primeraLetra = cadena.charAt(0);

            // Obtiene el código ASCII de la primera letra
            int codigoAscii = (int) primeraLetra;

            // Verifica si el código ASCII es par o no
            if (codigoAscii % 2 == 0) {
                System.out.println("El código ASCII de la primera letra de la cadena es par.");
            } else {
                System.out.println("El código ASCII de la primera letra de la cadena es impar.");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("La cadena está vacía o nula.");
        }
    }
}