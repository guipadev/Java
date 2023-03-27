package com.curso.solucionejerciciosjava.fibonacci;

import java.util.Scanner;

public class App {
    
    /*
    SERIE DE FIBONACCI
    Posición    1   2   3   4   5   6   7   8   9   10  ...     n
    ---------------------------------------------------------------------------------------
    valor       0   1   1   2   3   5   8   13  21  34  ...     valor en n-2 + valor en n-1
    */

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------- BIENVENIDO AL GENERADOR DE NUMEROS FIBANCCI --------");
        System.out.println("Digite la cantidad de posiciones deseadas en la serie:");
        
        // Tener en cuenta que puede haber desbordamiento
        int cantidadNumeros = sc.nextInt();
        
        int temporal1 = 0;
        int temporal2 = 1;
        int temporal3;
        
        if (cantidadNumeros >= 1) {
            System.out.println(temporal1);
        }
        
        if (cantidadNumeros >= 2) {
            System.out.println(temporal2);
        }
        
        for (int i = 3; i <= cantidadNumeros; i++) {
            temporal3 = temporal1 + temporal2;
            System.out.println(temporal3);
            temporal1 = temporal2;
            temporal2 = temporal3;
        }
    }
          
}
