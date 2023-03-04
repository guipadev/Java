package com.pildo._20programaciongenericaArrayList.creacionClasesGenericas;

public class UsoPareja {

	public static void main(String[] args) {

		//Ejemplo clase generica Pareja se adapta a tipo String
		ClaseGenericaPareja<String> una = new ClaseGenericaPareja<>();
		
		una.setPrimero("Camilo");
		
		System.out.println(una.getPrimero());
		
		//Ejemplo clase generica Pareja se adapta a tipo Persona
		Persona pers1 = new Persona("Ana");
		
		ClaseGenericaPareja<Persona> otra = new ClaseGenericaPareja<>();
		
		otra.setPrimero(pers1);
		
		System.out.println(otra.getPrimero());
	}

}

class Persona {
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre;
	}
}