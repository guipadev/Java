/*
Diseñe un algoritmo que involucre un ciclo y que nunca ingrese al
ciclo.
 */
package $04_While;

import java.util.Scanner;

public class Problema1 {
    
    public static void main(String [] args){
        int i = 7;  
        
        while (i <= 6){
            System.out.println(i);
            i = i + 1;
        }
    
        // se ejecuta al terminar el ciclo
        System.out.println (i);
    }
    
}
