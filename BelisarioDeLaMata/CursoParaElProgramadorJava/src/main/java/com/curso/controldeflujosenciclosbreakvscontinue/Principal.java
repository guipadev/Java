package com.curso.controldeflujosenciclosbreakvscontinue;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("------ Ciclo For ------");
        for (int iFor = 1; iFor <= 10; iFor++) {
            System.out.print("[" + iFor + "]");
        }
        
        System.out.println("\n------ Ciclo While ------");
        int iWhile = 1;
        while (iWhile <= 10) {
            System.out.print("[" + iWhile + "]");
            iWhile++;
        }
        
        System.out.println("\n------ Ciclo Do While ------");
        int iDoWhile = 1;
        do {
            System.out.print("[" + iDoWhile + "]");
            iDoWhile++;
        } while (iDoWhile <= 10);
        
        System.out.println("\n------ Romper Ciclo Con Break ------");
        
        CICLO_PRINCIPAL:
        for (int i = 1; i <= 10; i++) {
            System.out.println("-" + i);
            CICLO_SECUNDARIO:
            for (int j = 1; j <= 5; j++) {
                System.out.println("--" + j);
                if (j == 3) {
                    break;
                }
                if (i == 5 && j ==2) {
                    break CICLO_PRINCIPAL; // Así rompemos el ciclo principal con la etiqueta CICLO_PRINCIPAL
                }
            }
            System.out.println("*******");
        }
        System.out.println("SE TERMINÓ EL CICLO PRINCIPAL");
        
        
        System.out.println("\n------ Ciclo Continue ------");
         CICLO_PRINCIPAL:
        for (int i = 1; i <= 10; i++) {
            System.out.println("-" + i);
            CICLO_SECUNDARIO:
            for (int j = 1; j <= 5; j++) {
                System.out.println("--" + j);
                
                if (j == 2) {
                    continue;
                }                
                System.out.println("°°°" + j);  //Si es igual a 2 se mostrara
            }
            System.out.println("*******");
        }
        System.out.println("SE TERMINÓ EL CICLO PRINCIPAL");
    }
}
