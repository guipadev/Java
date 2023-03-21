package com.charlycimino.$46MULTICATCHcomoDiscriminarEXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {

    /*
      Prueba con manejo de excepciones (multicatch)
    */
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }
        catch (InputMismatchException ime) {
            System.out.println("No es un entero... ¬¬");
        }
        catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        }
        catch (Exception ex) { // Esta va de ultimo porque es una excepcione Gral
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("Adiós");
    }

}
