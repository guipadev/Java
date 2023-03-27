package com.curso.solucionejerciciosjava.detectarnumeromayorymenor;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-------- NUMERO MENOR Y MAYOR --------");
        System.out.println("Digite la cantida de números a evaluar");
        
        int cantidadNumeros = scanner.nextInt();
        
        int numeroMenor = 0;
        int numeroMayor = 0;
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Digite el número en la posición: " + (i + 1));
            int temporal = scanner.nextInt();
            
            if (i == 0) {
                numeroMenor = temporal;
                numeroMayor = temporal;
            } else if (temporal < numeroMenor) {
                numeroMenor = temporal;
            }
            
            if (temporal > numeroMayor) {
                numeroMayor = temporal;
            }
        }
        
        System.out.println("El número menor es " + numeroMenor);
        System.out.println("El número mayor es " + numeroMayor);
    }
    
}
