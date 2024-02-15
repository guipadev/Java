package com.example.main;

import com.example.impl.ElfFactory;
import com.example.impl.OrcFactory;

public class Main {

	public static void main(String[] args) {
		var elfFactory = new ElfFactory();

		var elfCharacter = elfFactory.createCharacter();
		var elfWeapon = elfFactory.createWeapon();

		System.out.println("Personaje: " + elfCharacter.getDescription() + ", arma: " + elfWeapon.getDescription());

		var orcFactory = new OrcFactory();
		var orcCharacter = orcFactory.createCharacter();
		var orcWeapon = orcFactory.createWeapon();

		System.out.println("Personaje: " + orcCharacter.getDescription() + ", arma: " + orcWeapon.getDescription());
		
		System.out.println("Personajes listos para el combate...");
	}

}
