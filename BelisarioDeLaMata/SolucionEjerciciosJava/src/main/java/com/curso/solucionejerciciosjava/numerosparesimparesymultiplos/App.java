package com.curso.solucionejerciciosjava.numerosparesimparesymultiplos;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        //Encontrar divisor de seis
        int divisor = 6;
        
        //Almacenar los datos encontrados
        List<Integer> listaPares = new LinkedList<>();
        List<Integer> listaImpares = new LinkedList<>();
        List<Integer> listaMultiplos = new LinkedList<>();
        
        //Recorrer
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                listaPares.add(i);
            } else {
                listaImpares.add(i);
            }
            
            if (i % divisor == 0) {
                listaMultiplos.add(i);
            }
        }
        
        System.out.println("-----------------------------------");
        System.out.println("---------- Números pares ----------");
        
        for (int valor: listaPares) {
            System.out.print(valor + ",");
        }
        
        System.out.println("\n-----------------------------------");
        System.out.println("---------- Números impares ----------");
    
        for (int valor: listaImpares) {
            System.out.print(valor + ",");
        }
    
        System.out.println("\n-----------------------------------");
        System.out.println("---------- Números multiplos de " + divisor + " ----------");
    
        for (int valor: listaMultiplos) {
            System.out.print(valor + ",");
        }
    }
}
