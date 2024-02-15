package com.example.api;

public abstract class Game {

	public abstract void initialize();

	public abstract void startPlay();

	public abstract void endPlay();

	// Método de plantilla que define el ciclo de vida de un juego
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}

}
