package com.pildo._29coleccionesMapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("45", new Empleado("Juan"));
		personal.put("46", new Empleado("Ana"));
		personal.put("47", new Empleado("Luis"));
		personal.put("48", new Empleado("Lucho"));
		
		System.out.println(personal);
	
		// Eliminar
		personal.remove("46");
		
		System.out.println(personal);
		
		// Sustituir
		personal.put("48", new Empleado("Natalia"));
		
		System.out.println(personal);
		
		System.out.println("-------- Recorrer y devolver en forma de set --------");
		
		// Mostrar resultado como un set
		System.out.println(personal.entrySet());
	
		System.out.println("-------- Recorrer foreach y devolver en forma de set --------");
		
		for (Map.Entry<String, Empleado> entrada : personal.entrySet()) {
			
			String clave = entrada.getKey();
			
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave = " + clave + " con valor =" + valor);
		}
	}

}
