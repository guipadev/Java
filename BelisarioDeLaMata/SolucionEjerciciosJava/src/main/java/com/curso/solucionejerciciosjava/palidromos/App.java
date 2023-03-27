package com.curso.solucionejerciciosjava.palidromos;

import java.util.Scanner;

public class App {

    /*
    OSO
    ANITA LAVA LA TINA
    DABALE ARROZ A LA ZORRA EL ABAD
    */
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------- VALIDAR PALINDROMOS --------");
        System.out.println("Digite el texto a evaluar:");
        
        String cadena = sc.nextLine();
        
        System.out.println(esPalindromo(cadena));
    }
    
    public static boolean esPalindromo(String cadena) {
        
        boolean validacion = true;
    
        cadena = cadena.replace(" ", "");
        
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)) {
                validacion = false;
                break;
            }
        }
        
        return validacion;
    }
}
