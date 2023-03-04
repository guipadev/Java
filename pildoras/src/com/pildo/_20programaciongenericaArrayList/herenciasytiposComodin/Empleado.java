package com.pildo._20programaciongenericaArrayList.herenciasytiposComodin;

public class Empleado {

	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String dameDatos() {
		return "Empleado se llama " + nombre + ",  tiene " + edad + " años, y un salario de $" + salario;
	}
}
