package com.example.impl;

import com.example.api.Content;

public class Movie implements Content {

	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public void play() {
		System.out.println("Reproduciendo la película: " + title);
	}

	public void pause() {
		System.out.println("Pausando la película: " + title);
	}

	public void stop() {
		System.out.println("Deteniendo la película: " + title);
	}

}
