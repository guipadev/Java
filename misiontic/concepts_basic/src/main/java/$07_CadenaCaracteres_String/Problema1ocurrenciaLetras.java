package $07_CadenaCaracteres_String;

import java.io.IOException;
import java.util.Scanner;

/**
 * Elabore un programa que dada una letra cuente cuantas ocurrencias
 * de esta letra hay.
 * **/

public class Problema1ocurrenciaLetras {

    public static void main(String[] args) throws IOException {
        Scanner texto = new Scanner(System.in);

        System.out.println("Escriba una frase, por favor: ");

        String frase = texto.nextLine();

        System.out.println("Ingrese letra a buscar en frase: ");

        char caracter = (char) System.in.read();

        System.out.println("El caracter se repite: " + contarCaracteres(frase, caracter) + " veces");
    }
    public static int contarCaracteres(String texto, char caracter) {
        int posicion, contador = 0;

        //se busca la primera vez que aparece
        posicion = texto.indexOf(caracter);

        //mientras se encuentre el caracter
        while (posicion != -1) {
            //se cuenta
            contador++;

            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = texto.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
}
