package com.pildo._15Excepciones;

import javax.swing.JOptionPane;

//clausula throws utilizada en declaracion de un método, podria lanza una excepción
//clausula throw se puede utilizar en cualquier punto del código e indicar que en dicho punto se lanza una expeción

public class LanzamientoExcepFormaManualClausulathrowControlado {

	//Indicamos que el método puede mandar una excepción y seria bueno capturarla
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int arroba = 0;

		boolean punto = false;

		String mail = JOptionPane.showInputDialog("Introduce emial");

		if (mail.length() <= 3) {
			//ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
			//throw miExcepcion;
			throw new ArrayIndexOutOfBoundsException();
		} else {

			for (int i = 0; i < mail.length(); i++) {

				if (mail.charAt(i) == '@') {
					arroba++;
				}

				if (mail.charAt(i) == '.') {
					punto = true;
				}
			}

			if (arroba == 1 && punto == true) {
				System.out.println("Es correcto");
			} else {
				System.out.println("No es correcto");
			}
		}

	}
}