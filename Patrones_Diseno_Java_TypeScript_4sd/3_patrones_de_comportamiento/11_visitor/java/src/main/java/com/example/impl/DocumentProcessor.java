package com.example.impl;

import com.example.api.DocumentVisitor;

public class DocumentProcessor implements DocumentVisitor {
	@Override
	public void visitParagraph(ParagraphElement paragraph) {
		System.out.println("Procesando un párrafo");
	}

	@Override
	public void visitHeader(HeaderElement header) {
		System.out.println("Procesando un encabezado");
	}

}
