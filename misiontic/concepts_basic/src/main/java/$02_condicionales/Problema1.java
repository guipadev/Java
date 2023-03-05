/*
Dado un número entero, determinar si ese número corresponde al
código ASCII de una vocal minúscula.
 */
package $02_condicionales;

import java.util.Scanner;

public class Problema1 {
    
    public static int numeroAscii(int numero){
        int numeroEvaluar = numero;
        if(numeroEvaluar > 96 && numeroEvaluar <= 122 ){
            System.out.println("Corresponde ASCII de una vocal minúscula");
        }else if (numeroEvaluar > 64 && numeroEvaluar <= 90 ){
            System.out.println("Corresponde ASCII de una vocal MAY");
        }else{
            System.out.println("Corresponde ASCII de CONTROL o ESPECIAL");
        }
        return numeroEvaluar;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = sc.nextInt();
        
        System.out.println(numeroAscii(numero));
    }
    
}
