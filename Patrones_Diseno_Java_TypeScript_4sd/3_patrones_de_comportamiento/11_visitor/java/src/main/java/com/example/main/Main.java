package com.example.main;

import com.example.api.DocumentElement;
import com.example.impl.DocumentProcessor;
import com.example.impl.HeaderElement;
import com.example.impl.ParagraphElement;

public class Main {

	public static void main(String[] args) {
		DocumentElement[] elements = { new ParagraphElement(), new HeaderElement() };
		var visitor = new DocumentProcessor();

		for (DocumentElement element : elements) {
			element.accept(visitor);
		}
	}

}
