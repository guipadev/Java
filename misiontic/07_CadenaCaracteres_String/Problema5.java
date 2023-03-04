package CadenaCaracteres_String;

import java.util.Scanner;

/**
 * Desarrollar un algoritmo que permita concatenar dos cadenas (colocar
 * la segunda inmediatamente después de la primera), hay que tener en
 * cuenta que la cadena resultante tendrá un tamaño mayor que
 * cualquiera de la cadenas operandos si son distintas de la cadena vacía
 * (la cadena resultante debe quedar guardada en una variable aparte).
 * **/

public class Problema5 {

    public static String contactenarTexto(String texto1, String texto2){
        String textoCompleto = texto1 + " " + texto2;
        return textoCompleto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto1;
        String texto2;


        System.out.println("Ingresa el 1er texto");
        texto1 = sc.nextLine();
        System.out.println("Ingresa el 2do texto");
        texto2 = sc.nextLine();

        System.out.println(contactenarTexto(texto1, texto2));

        //1ra forma
        //System.out.println(texto1 + " " + texto2);

        //2da forma
        //System.out.println(texto1 + texto2);

        //3era forma
        //StringBuilder contenido = new StringBuilder();
        //contenido.append(texto1);
        //contenido.append(", ");
        //contenido.append(texto2);
        //System.out.println(contenido.toString());

        //4ta
        //StringBuffer textos = new StringBuffer();
        //textos.append(texto1).append(", ").append(texto2);
        //System.out.println(textos.toString());
    }
}
