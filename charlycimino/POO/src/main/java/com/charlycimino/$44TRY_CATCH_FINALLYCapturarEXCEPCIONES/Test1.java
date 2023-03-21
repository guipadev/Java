package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES;

import java.util.Scanner;

/**
 * No utilizar Finally a no ser que sea necesario, este sirve es para liberar recursos
 */
public class Test1 {

    /*
      Prueba sin manejo de excepciones
    */
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");

        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        } catch (Exception ex) {
            System.out.printf("Ocurrio un error");
        } finally {
            System.out.printf("Adios!");
        }

        System.out.println("Adiós!");
    }

}
