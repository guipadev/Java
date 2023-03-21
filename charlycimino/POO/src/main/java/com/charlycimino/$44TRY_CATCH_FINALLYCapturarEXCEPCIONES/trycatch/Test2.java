package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES.trycatch;

import java.util.Scanner;

public class Test2 {

    /*
      Prueba con manejo de excepciones (un solo catch general)
    */
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }
        catch (Exception ex) {
            System.out.println("Ocurrió un error");
        }
        finally {
            System.out.println("Adiós");
        }
        System.out.println("jeje Adiós");
    }

}
