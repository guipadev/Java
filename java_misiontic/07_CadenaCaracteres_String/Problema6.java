package CadenaCaracteres_String;

import java.io.IOException;
import java.util.Scanner;

/**
 * Desarrollar un algoritmo que invierta una cadena de caracteres (la
 * cadena invertida debe quedar guardada en una variable aparte).
 * **/

public class Problema6 {

    public static String textoInvertido(String texto){
        String cadena = texto;
        StringBuilder builder=new StringBuilder(cadena);
        String sCadenaInvertida=builder.reverse().toString();
        return  sCadenaInvertida;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Ingresa el texto a invertir");
        cadena = sc.nextLine();

        System.out.println(textoInvertido(cadena));
    }
}
