package com.pildo._15Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerDatos {

	public static void main(String[] args) {
		
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner sc = new Scanner(System.in);
		
		int decision = sc.nextInt();
		
		if (decision == 1) {
			
			//La captura de la excepción correcta debe realizarse al invocar el método
			try {
				pedirDatos();
			} catch(InputMismatchException e) { //Excepción misma que tiene el método
				System.out.println("Que demonios has introducido en edad??");
			}
			
		} else {
			System.out.println("Adios");
			System.exit(0);
		}
		sc.close();
	}

	//Aquí se presenta una EXCEPCIÓN NO COMPROBADA, ya si damos otra estructura al código
	//No estoy obligado a utilizar try catch
	private static void pedirDatos() throws InputMismatchException { // si algo anda mal, arroja la excepción capturaInputMismatchException
		
		//Utilizar mucho try catch es mala practica si puede relizar validaciones sin esta necesidad		
		//try {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce tú nombre, por favor: ");
			String nombre = sc.nextLine();
			
			System.out.println("Introduce tú edad, por favor: ");
			int edad = sc.nextInt();	
			
			System.out.println("Hola " + nombre + " el año que viene, tendras " + (edad+1) + " años");
			
			sc.close();
			
		//} catch(InputMismatchException e) {//la excepcion la misma del método o superior jerarquia ej:
										   //InputMismatchException en vez de esto podria ser Exception
			//System.out.println("Que demonios has introducido en edad??");
		//}		
		//Si todo sale bien o mal, arroja este msj
		System.out.println("Hemos terminado");
	}
}
