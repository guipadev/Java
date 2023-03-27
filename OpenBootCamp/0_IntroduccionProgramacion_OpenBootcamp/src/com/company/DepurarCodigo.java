package com.company;

public class DepurarCodigo {

    public static void main(String[] args) {
        int suma = 0;
        suma = suma + 16;

        //breack point
        System.out.println(suma);

        int valores[] = new int[5];
        int posicion  = 4;

        // watcher
        System.out.println(valores[posicion]);

        //pilas de llamada
        funcion1();
    }

    //pilas de llamada
    public static void funcion1() {
        funcion2();
    }

    public static void funcion2() {
        funcion3();
    }

    public static void funcion3() {
        funcion4();
    }

    public static void funcion4() {
        System.out.println("Probado las pilas de llamada");
    }
}
