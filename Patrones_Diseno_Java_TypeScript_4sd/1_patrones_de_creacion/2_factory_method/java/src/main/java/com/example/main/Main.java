package com.example.main;

import com.example.api.Media;
import com.example.api.MediaFactory;
import com.example.impl.ImageFactory;
import com.example.impl.VideoFactory;

public class Main {

	public static void main(String[] args) {
		//Creamos una fábrica de imágenes y creamos un elemento multimedia
		MediaFactory imageFactory = new ImageFactory();
		Media image = imageFactory.createMedia();
		System.out.println(image.getDescription());
		
		// Creamos una fábrica de videos y creamos un elemento multimedia
		MediaFactory videoFactory = new VideoFactory();
		Media video = videoFactory.createMedia();
		System.out.println(video.getDescription()); 
	}

}
