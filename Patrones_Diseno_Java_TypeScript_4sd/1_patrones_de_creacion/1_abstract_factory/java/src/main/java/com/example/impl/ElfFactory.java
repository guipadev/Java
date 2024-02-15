package com.example.impl;

import com.example.api.AbstractFactory;
import com.example.api.Character;
import com.example.api.Weapon;

public class ElfFactory implements AbstractFactory {

	public Character createCharacter() {
		return new Elf();
	}

	public Weapon createWeapon() {
		return new Bow();
	}

}
