package com.example.impl;

import java.util.HashMap;
import java.util.Map;

import com.example.api.TextCharacter;

public class CharacterFactory {

	private Map<Character, TextCharacter> characterMap = new HashMap<>();

	public TextCharacter getCharacter(char character) {
		if (!characterMap.containsKey(character)) {
			characterMap.put(character, new ConcreteTextCharacter(character));
		}
		return characterMap.get(character);
	}

}
