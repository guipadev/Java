package com.example.main;

import com.example.api.TextCharacter;
import com.example.impl.CharacterFactory;

public class Main {

	public static void main(String[] args) {
		CharacterFactory characterFactory = new CharacterFactory();

		String text = "Hello, World!";
		for (char c : text.toCharArray()) {
			TextCharacter character = characterFactory.getCharacter(c);
			character.printCharacter();
		}
	}

}
