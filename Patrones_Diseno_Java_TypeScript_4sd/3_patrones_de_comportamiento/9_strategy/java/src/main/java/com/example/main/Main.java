package com.example.main;

import com.example.impl.BlackAndWhiteFilter;
import com.example.impl.ImageProcessor;
import com.example.impl.SepiaFilter;

public class Main {

	public static void main(String[] args) {
		var imageProcessor = new ImageProcessor();

		// Aplicar el filtro en blanco y negro
		imageProcessor.setFilter(new BlackAndWhiteFilter());
		imageProcessor.processImage("imagen1.jpg");

		// Cambiar al filtro sepia y aplicarlo
		imageProcessor.setFilter(new SepiaFilter());
		imageProcessor.processImage("imagen2.jpg");
	}

}
