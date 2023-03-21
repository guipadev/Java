package com.mitocode.patronesdedisenio._1singleton.model;

public class Conexion {
	
	//Declaración, acceder a sus métodos estáticos sin pasar por una instancia
	private static Conexion instancia;
	//private static Conexion instancia = new Conexion();
	
	//Para evitar instancia mediante operador "new"
	private Conexion() { }
	
	//Para obtener la instancia unicamente por este metodo
	//Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
	public static Conexion getInstancia() {
		if(instancia == null) {		// Si no hay instancia se crea, pero si ya un usuario previo lo realizo, entonces el proximo solo recibe la instancia
			instancia = new Conexion();
		}
		return instancia;
	}
	
	//Metodo de prueba
	public void conectar() {
		System.out.println("Me conecto a la BD");
	}
	
	//Metodo de prueba
	public void desconectar() {
		System.out.println("Me desconecto de la BD");
	}

}
