package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES.excepcionespropias;

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
