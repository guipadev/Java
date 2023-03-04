package com.pildo._16debugging;

import javax.swing.JOptionPane;

public class Aleatorio {

	public static void main(String[] args) {
		
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
		
		int numAleatorio[] = new int[elementos];
		
		for (int i = 0; i < numAleatorio.length; i++) {
			numAleatorio[i] = (int)(Math.random() * 100);
		}
		
		for (int elemento : numAleatorio) {
			System.out.print(elemento);
		}
			
	}
}
