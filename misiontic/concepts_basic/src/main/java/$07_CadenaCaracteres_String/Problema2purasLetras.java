package $07_CadenaCaracteres_String;

import java.util.Scanner;

/**
 Elabore un programa que dada una cadena diga si todos los símbolos de la cadena son letras.
 **/

public class Problema2purasLetras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba una frase, por favor: ");

        String cadenas = sc.nextLine();

        System.out.println("La cadena de texto solo contiene letras? " + contieneSoloLetras(cadenas));
    }
    public static String contieneSoloLetras(String cadena) {

        for (int x = 0; x < cadena.length(); x++) {

            char car = cadena.charAt(x);

            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((car >= 'a' && car <= 'z') || (car >= 'A' && car <= 'Z') || car == ' ')) {
                return String.valueOf("NO se cumple");
            }
        }
        return String.valueOf("Si se cumple");
    }
}