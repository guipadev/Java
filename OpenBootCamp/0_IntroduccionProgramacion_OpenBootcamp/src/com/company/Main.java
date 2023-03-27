package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(suma(3, 2, 4));

        Coche miCoche = new Coche();

        miCoche.puertas = aumentarPuertas(1);

        System.out.println("El coche tiene: " + miCoche.puertas + " puertas!!");

        

    }

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }

    public static int aumentarPuertas (int puertas) { return puertas; }


}
