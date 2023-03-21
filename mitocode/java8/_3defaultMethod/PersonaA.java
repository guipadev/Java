package com.mitocode.java8._3defaultMethod;

public interface PersonaA {

	public void caminar();
	
	default public void hablar(){
		System.out.println("Saludos Coders - PersonaA");
	}
	
}
