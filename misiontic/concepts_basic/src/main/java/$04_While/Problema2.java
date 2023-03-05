/*
Diseñe un algoritmo que involucre un ciclo y que se ejecute indefinidamente.
 */
package $04_While;

public class Problema2 {
    
    public static void main(String [] args){
        int i = 7;  
        
        while (i <= i){
            System.out.println(i);
            i = i + 1;
        }
    
        // se ejecuta al terminar el ciclo
        System.out.println (i);
    }
    
    
}
