package $07_CadenaCaracteres_String;

import java.util.Scanner;

/**
 Desarrollar un algoritmo que determine si una cadena de caracteres es palindrome.
 Una cadena se dice palindrome si al invertirla es igual a ella misma. Ejemplos:
 “ala” es palindrome
 “anita lava la tina” No es palindrome, pues al invertirla con espacios
 no es exactamente igual a la original.
 “los estudiantes de programación leyeron toda la guía” no es palindrome.
 “robas ese sabor” es palindrome
**/

public class Problema7palindrome {

    public static void main(String[] args) {
        String palabra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la palabra o frase a verificar si es palindrome");

        palabra = sc.nextLine();

        System.out.println("¿La palabra " + palabra + " es palindrome?: " + esPalindrome(palabra));
    }
    public static  boolean esPalindrome(String palabra){
        //pasamos todas las letras a min
        palabra = palabra.toLowerCase();

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--){

            //i empieza al inicio de la frase o palabra y j al final
            if (palabra.charAt(i) != palabra.charAt(j)){
                //Si NO se cumple
                return false;
            }
        }
        //Si se cumple
        return  true;
    }

}

