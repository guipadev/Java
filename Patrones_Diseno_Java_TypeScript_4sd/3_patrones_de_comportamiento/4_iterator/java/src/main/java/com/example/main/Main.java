package com.example.main;

import com.example.api.Iterator;
import com.example.impl.BookCollection;

public class Main {

	public static void main(String[] args) {
		// Crear una colección de libros
		String[] booksArray = { "Libro 1", "Libro 2", "Libro 3", "Libro 4", "Libro 5" };
		BookCollection bookCollection = new BookCollection(booksArray);

		/*
		 * Utilizar el iterador para recorrer la colección
		 */
		Iterator<String> iterator = bookCollection.iterator();
		while (iterator.hasNext()) {
			String book = iterator.next();
			System.out.println("Libro: " + book);
		}

	}

}
