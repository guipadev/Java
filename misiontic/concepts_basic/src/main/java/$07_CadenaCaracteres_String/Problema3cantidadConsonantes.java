package $07_CadenaCaracteres_String;

import java.util.Scanner;

/**
 * Elabore un programa que dada una cadena cuente las consonantes en dicha cadena.
 * **/

public class Problema3cantidadConsonantes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palabra;

        int contador1 = 0, contador2 = 0, consonante = 0;

        System.out.println("Digite sus palabras");

        palabra = entrada.nextLine();

        //Ciclo for obtiene longitud de cadena y cantidad de letras ingresadas
        for (int i = 0; i < palabra.length(); i++) {
            contador1++;
        }

        for (int i = 0; i < palabra.length(); i++){
            //Ahora evaluamos la cadena ingresada en busca de las vocales
            if((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') ||
                    (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u')
            ) {
                contador2++;
            }
        }
        //Resta var contador para obtener consonante
        consonante = contador1 - contador2;

        System.out.println("La palabra " + palabra + " contiene " + contador2 + " vocales");
        System.out.println("La palabra " + palabra + " contiene " + consonante + " consonantes");
    }


}
