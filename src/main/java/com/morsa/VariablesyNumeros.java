package com.morsa;

import static Utilidades.Utils.*;

public class Numeros {

    public static void main(String[] args) {

        println(2);
        println(2+2);
        println("2+2");
        println("2" + "2");

        println(3*2);
        println(10 - 5);
        println(10 / 5);
        println(10 /3);
        println(20.5 + 2.1);
        println(20.5 + 10);

        int numero = 3;

        double conDecimal = 10.5;
        float esOtroDecimal = 10.5f;

        double resultado = numero * conDecimal;

        println(resultado);
        println("resultado");

        println("El resultado es: " + resultado);

        String resultadConText = "El resultado es: " + resultado;
    }
}
