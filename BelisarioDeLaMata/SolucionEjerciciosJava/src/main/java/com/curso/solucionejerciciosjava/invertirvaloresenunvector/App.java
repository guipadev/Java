package com.curso.solucionejerciciosjava.invertirvaloresenunvector;

public class App {

    public static void main(String[] args) {
       
        int[] valores = new int[] {1,4,5,9,10,31,41,42,52,73};
        
        mostrarVector(valores);
        
        for (int i = 0; i < valores.length / 2; i++) {
            int temporal = valores[i];
            valores[i] = valores[valores.length - 1 - i];
            valores[valores.length - 1 - i] = temporal;
        }
        
        System.out.println("\n----------");
        
        mostrarVector(valores);
    }
    
    public static void mostrarVector(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + ",");
        }
    }
}
