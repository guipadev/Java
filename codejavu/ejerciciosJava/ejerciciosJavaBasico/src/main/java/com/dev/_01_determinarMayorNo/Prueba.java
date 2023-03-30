package com.dev._01_determinarMayorNo;

public class Prueba {

    public static void main(String[] args) {
        int cantidad = 0;

        int numero = 2;

        while (cantidad < 100) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                count++;
            }
            numero++;
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
