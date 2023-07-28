package co.guipadev.MathRandom;

/**
 1. ¿Qué es java.lang.Math.random() en java?
 El método Math.random() en Java.
 El Math.random() método es una función de la clase Math que acepta cero argumentos y devuelve un número
 pseudo aleatorio entre 0 (inclusive) y 1 (exclusivo).
 */
public class SimpleRandom {

    public static void main(String[] args) {
        //La función devuelve un número aleatorio entre 0(inclusive) y 1(exclusivo)
        for (int i = 0; i < 5; i++)
            System.out.println(Math.random());

        /*
        La salida podría ser:
        0.1209483334305419
        0.5720587874439879
        0.7066503715407789
        0.315074080697907
        0.9527311172606369
         */

    }
}
