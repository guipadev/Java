package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES.trycatch;

import java.util.Scanner;

public class Test1 {

    /*
      Prueba sin manejo de excepciones
    */
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = x / y;
        System.out.println("Resultado: " + z);
        System.out.println("Adiós!");
    }

}
