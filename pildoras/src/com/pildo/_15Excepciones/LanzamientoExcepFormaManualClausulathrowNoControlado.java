package com.pildo._15Excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class LanzamientoExcepFormaManualClausulathrowNoControlado {

	public static void main(String[] args) {

		String mail = JOptionPane.showInputDialog("Introduce emial");
		
		try	{
			examinaEmail(mail);
		} catch(EOFException e) {
			System.out.println("Dirección email incorrecta!!");
		}
	}

	private static void examinaEmail(String mail) throws EOFException {
		 int arroba = 0;

	     boolean punto = false;
	     
	     if (mail.length() <= 3) {
	    	 throw new EOFException();
	     } else {
	    
	    	 for (int i = 0; i < mail.length(); i++) {

		            if (mail.charAt(i) == '@') {
		                arroba++;
		            }

		            if (mail.charAt(i) == '.') {
		                punto = true;
		            }
		        }

		        if (arroba == 1 && punto == true)  {
		            System.out.println("Es correcto");
		        } else {
		            System.out.println("No es correcto");
		        }
	     }
	}
}