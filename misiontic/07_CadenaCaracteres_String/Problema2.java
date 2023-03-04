package CadenaCaracteres_String;

import java.util.Scanner;

/**
 Elabore un programa que dada una cadena diga si todos los símbolos de la cadena son letras.
 **/

public class Problema2 {

    public static String contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return String.valueOf("NO se cumple");
            }
        }
        return String.valueOf("Si se cumple");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase, por favor: ");
        String cadenas = sc.nextLine();
        System.out.println("Se cumple que la cadena de texto tengas solo letras: " + contieneSoloLetras(cadenas));
    }
}