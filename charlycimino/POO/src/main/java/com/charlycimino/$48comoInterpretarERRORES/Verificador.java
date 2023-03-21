package com.charlycimino.$48comoInterpretarERRORES;

public class Verificador {

    public static void checkEsNegativo(int x) throws RuntimeException  { // El throws sería opcional por ser 'unchecked'
        if (x < 0)
            throw new RuntimeException("No puede ser negativo");
    }
}
