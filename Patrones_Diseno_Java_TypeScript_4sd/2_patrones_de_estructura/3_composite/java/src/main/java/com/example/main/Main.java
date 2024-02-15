package com.example.main;

import com.example.api.Component;
import com.example.impl.Document;
import com.example.impl.Text;

public class Main {

	public static void main(String[] args) {
		// Crear elementos hoja (texto)
		Component heading = new Text("Título del documento");
		Component paragraph = new Text("Este es un párrafo de texto.");

		// Crear un documento compuesto que contiene texto y elementos gráficos
		Document document = new Document();
		document.addComponent(heading);
		document.addComponent(paragraph);

		// Renderizar el documento
		document.render();

	}

}
