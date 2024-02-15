package com.example.main;

import com.example.api.Document;
import com.example.impl.TextDocument;

public class Main {

	public static void main(String[] args) {
		// Crear un documento de texto y establecer su contenido
		Document textDocument = new TextDocument();
		textDocument.setContent("Este es un documento de texto.");

		// Clonar el documento de texto
		Document clonedTextDocument = textDocument.cloneDocument();

		System.out.println("Contenido del documento original: " + textDocument.getContent());
		System.out.println("Contenido del documento clonado: " + clonedTextDocument.getContent());

		Document imageDoc = new TextDocument();
		imageDoc.setContent("Esto es una imagen.");

		Document clonedImage = imageDoc.cloneDocument();
		System.out.println("Contenido de la imagen original: " + imageDoc.getContent());
		System.out.println("Contenido de la imagen clonada: " + clonedImage.getContent());

	}

}
