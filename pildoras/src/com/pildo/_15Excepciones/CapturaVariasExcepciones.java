package com.pildo._15Excepciones;

import javax.swing.JOptionPane;

public class CapturaVariasExcepciones {
	
	public static void main(String[] args) {
		
		// Mala práctica ya que es una excepcion que no indica el error real, uso Exception e
		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("Estas diviendo por 0");
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un número entero");
			//System.out.println(e.getMessage()); //tipo error
			System.out.println("Se ha generado error tipo: " + e.getClass().getName());
		}
		
		
	}

	private static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividiendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.print("El resultado es: " + num1/num2); 
	}
}
