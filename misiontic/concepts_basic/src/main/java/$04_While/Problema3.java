/*
Diseñe un algoritmo que pida un valor entero, y que siga leyendo
valores enteros mientras que alguno de esos valores no represente el
código ASCII de una letra mayúscula del alfabeto ingles.
 */
package $04_While;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite número: ");

        try {

            int num = sc.nextInt();

            while (num > 0) {

                if (num >= 65 && num <= 90) // mayor que cero: positivo
                {
                    System.out.println("ASCII palabras en MAY");
                }

                if (num >= 97 && num <= 122) { // mayor que cero: positivo
                    System.out.println("ASCII palabras en MIN");
                }else { // si no es positivo: es negativo
                    System.out.println("Algun otro caracter de ASCII");
                }

                // repetimos el proceso y volvemos a leer num
                System.out.print("Introduzca otro número: ");

                num = sc.nextInt();
            }

            System.out.println("ASCII ENCONTRADO");
        } catch (RuntimeException e) {
            System.out.println("Solo se permite ingreso numeros enteros " + e);
        }


    }
}
