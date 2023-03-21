package com.yadevom._20Systemoutprintln;
//https://programandoenjava.com/system-out-println/
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemOutPrintLn {

    public static void main(String[] args) throws IOException {
        // System: clase final de Java dentro del JDK
        // out: objeto se encuentra dentro de la final de Java PrintStream
        System.out.println();

        // Ejemplo uso de otra forma imprimir
        PrintStream consola = System.out;
        consola.println("Hola mundo");

        // Imprime en la misma linea
        consola.print("Hola ");
        consola.print("Momia");

        // Acepta parametro en la linea
        int edad = 30;
        consola.printf("Hola tengo %d años", edad);
        // %s String, %d decimal, %t fehcas y horas, %b booleano, %c caracter

        // Ingreso de datos
        final int codigoTecla = System.in.read();

        System.out.println(codigoTecla);

        // Scanear todo lo ingresado por pantalla
        Scanner scanner = new Scanner(System.in);
        System.out.println(codigoTecla);

        // QUe ha introducido el usuario por teclado
        System.out.println(scanner.nextLine());
    }
}
