package com.charlycimino.$47THROWcomoLanzarEXCEPCIONES;

public class Test5 {

    /*
      ¿Dónde se lanza la excepción?
    */
    public static void main(String[] args) {
        int x = Math.incrementExact(2147483647);
        System.out.println(x);
    }

}