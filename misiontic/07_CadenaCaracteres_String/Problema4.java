package CadenaCaracteres_String;

import java.util.Scanner;

/**
 * Desarrollar un algoritmo que retorne un valor booleano que indique si
 * dos cadenas son iguales, esto es, que tienen la misma longitud con los
 * mismos símbolos en la mismas posiciones.
 * **/

public class Problema4 {

    public static boolean compararTexto(String one, String two) {
        if(one.equals(two)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String texto1 = "";
        String texto2 = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1eras palabras a comparar");
        texto1 = sc.nextLine();

        System.out.println("Digite 2das palabras a comparar");
        texto2 = sc.nextLine();

        System.out.println("Los textos ingresados son: "+compararTexto(texto1, texto2));

    }
}
