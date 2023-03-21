package com.charlycimino.$47THROWcomoLanzarEXCEPCIONES;

public class Calculadora {

    public int factorial (int num) {
        if (num < 0) {//Aqui podria ser ArithmeticException
            throw new RuntimeException("No se puede calcular el factorial de un número negativo");
        }
        if (num > 12) {//Aqui podria ser IllegalArgumentException
            throw new RuntimeException("Por limitaciones técnicas, no se puede calcular el factorial de un entero mayor que 12");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
