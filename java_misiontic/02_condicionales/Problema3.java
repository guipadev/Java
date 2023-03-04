/*
Dado un carácter, construya un programa en para determinar si el
carácter es un dígito o no.
 */
package condicionales;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el caracter");
        //Guardar datos ingresados
        char caracter = sc.next().charAt(0);
        //Convertir a entero
        int ascii = (int)caracter;
        System.out.println("El caracter: "+ caracter+" es codigo ASCII "+(ascii));
        
    }
    
}
