package com.pildo._15Excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class CrearExcepcionesPropias {

	public static void main(String[] args) {

		String mail = JOptionPane.showInputDialog("Introduce emial");
		
		try {
			examinaEmail(mail);
		} catch(Exception e) {
			System.out.println("Dirección mail incorrecta!!");
			//pista del tipo error en consola
			//e.printStackTrace();
		}
		
		
	}

	private static void examinaEmail(String mail) throws LongitudMailErronea {
		 int arroba = 0;

	     boolean punto = false;
	     
	     if (mail.length() <= 3) {
	    	 //Mejor con parametro para indicar mensaje
	    	 throw new LongitudMailErronea("Mail no puede ser menor 3 caracteres");
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

//Para crear excepciones propias debemos heredar de estas
//Error controlado Try Catch obligatorio Exception o IOException
//Error No Controlado Opcional Try Catch el RuntimeException
class LongitudMailErronea extends Exception {
	//Obligatorio constructor con parametro y sin parametro
	public LongitudMailErronea() {}
	
	public LongitudMailErronea(String msjError) {
		super(msjError);
	}
}