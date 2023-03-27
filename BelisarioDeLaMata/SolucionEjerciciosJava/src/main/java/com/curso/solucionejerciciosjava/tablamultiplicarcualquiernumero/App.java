package com.curso.solucionejerciciosjava.tablamultiplicarcualquiernumero;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------- TABLA DE MULTIPLICAR --------");
        System.out.println("Digite el número al que quiere generarle la tabla:");
        
        int numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
             System.out.println(numero + "*" + i + "=" + (numero * i));
        }
    }
}
