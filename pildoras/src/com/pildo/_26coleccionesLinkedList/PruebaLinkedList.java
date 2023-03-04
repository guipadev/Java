package com.pildo._26coleccionesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<>();
		
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		// Itera
		ListIterator<String> it = personas.listIterator();

		// corre una posición
		it.next();
		
		// Quedo incluido 2da posición
		it.add("Juan");

		for (String persona : personas) {
			System.out.println(persona);
		}
	}

}
