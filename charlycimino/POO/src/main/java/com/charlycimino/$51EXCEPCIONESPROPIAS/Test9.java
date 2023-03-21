package com.charlycimino.$51EXCEPCIONESPROPIAS;

import java.util.Scanner;

public class Test9 {

    /*
      Manejo de excepciones propias
    */
    public static void main(String[] args) {
        int y, z;
        System.out.print("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = new Calculadora().factorial(y);
        System.out.println("Resultado: " + z);
        System.out.println("Adiós!");
    }
}
