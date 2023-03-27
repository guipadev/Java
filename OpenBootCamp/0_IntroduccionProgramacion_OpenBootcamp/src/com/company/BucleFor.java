package com.company;

public class BucleFor {

    public static void main(String[] args) {
        int valores[] = {10, 20, 30, 40, 50};

        for (int contador = 1; contador <= 10; contador = contador + 1) {
            System.out.println(contador);
            // Despues de esta línea
        }

        System.out.println("/*****************************/");

        // 0 < 5
        // 1 < 5
        // 2 < 5
        // 3 < 5
        // 4 < 5
        // 5 < 5 !ESTA NO
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

}
