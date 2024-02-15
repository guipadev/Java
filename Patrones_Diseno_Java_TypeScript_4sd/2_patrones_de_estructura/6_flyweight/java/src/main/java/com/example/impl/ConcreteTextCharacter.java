package com.example.impl;

import com.example.api.TextCharacter;

public class ConcreteTextCharacter implements TextCharacter {
	private char character;

	public ConcreteTextCharacter(char character) {
		this.character = character;
	}

	public void printCharacter() {
		System.out.print(character);
	}
}
