package com.example.impl;

import com.example.api.Game;

public class Monopoly extends Game {
	
	@Override
	public void initialize() {
		System.out.println("Inicializando el juego de Monopoly");
	}

	@Override
	public void startPlay() {
		System.out.println("Comenzando el juego de Monopoly");
	}

	@Override
	public void endPlay() {
		System.out.println("Terminando el juego de Monopoly");
	}
}
