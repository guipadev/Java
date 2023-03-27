package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            count++; //condicion aquí para no quedar en bucle infinito

            if(count == 0)
                continue;
                // continue seguira buscando a pesar de haberse cumplido la condición
                // break    romperia el flujo para que no siga buscando

            System.out.println("hola mundo " + count);
        }
        System.out.println("fin");
    }
}
