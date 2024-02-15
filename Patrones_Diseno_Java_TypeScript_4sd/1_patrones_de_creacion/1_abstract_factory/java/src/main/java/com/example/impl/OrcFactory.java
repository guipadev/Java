package com.example.impl;

import com.example.api.AbstractFactory;
import com.example.api.Character;
import com.example.api.Weapon;

public class OrcFactory implements AbstractFactory {

	public Character createCharacter() {
		return new Orc();
	}

	public Weapon createWeapon() {
		return new Sword();
	}
	


}
