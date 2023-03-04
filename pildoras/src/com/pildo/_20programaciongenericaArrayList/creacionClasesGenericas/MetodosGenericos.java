package com.pildo._20programaciongenericaArrayList.creacionClasesGenericas;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombres[] = {"Marco", "Maria", "Maicol"};
		
		String elementos = MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		
		//Ejemplo con tipo Empleado
		Empleado listaEmpleados[] = { 
				new Empleado("joses", 20, 2500),
				new Empleado("jaime", 23, 3500),
				new Empleado("jesus", 29, 4250),
				new Empleado("jesus", 29, 4250),
				new Empleado("jesus", 29, 4250)
		};
		//metodo recibe tipo Empleado
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		
		System.out.println("-------- Implementando método buscar elemento menor	 --------");
		
		System.out.println(MisMatrices.getDescendente(nombres));
		
		//Ejemplo tipo Empleado no se podria porque no implementa interfaz comparable
		/*
		Empleado e1 = new Empleado("Paco", 1, 2500);
		Empleado e2 = new Empleado("Hugo", 1, 2500);
		Empleado e3 = new Empleado("Luis", 1, 2500);
		
		Empleado misEmpleados[] = {e1, e2, e3};
	
		System.out.println(MisMatrices.getDescendente(misEmpleados));
		*/
		
		//Ejemplo funcionamiento GCaldendar ya que implementa la interfaz comparable
		GregorianCalendar fechas[] = {
				new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2025,03,19),
				new GregorianCalendar(2021,01,17),
		};
		
		System.out.println(MisMatrices.getDescendente(fechas));
	}
}

//Metodo generico, va a funcionar con cualquier tipo de array excepto primitivos
class MisMatrices {
	
	//Método generico, devuelve un String y recibe un Array generico
	public static <T> String getElementos(T[] arr) {
		return "El array tiene " + arr.length + " elementos";
	}
	
	//Método generico, organiza en forma descendente}
	public static <T extends Comparable> T getDescendente(T[] arr) {
		//las clases String, Date implementan, GCalendar la interfaz Comparable
		
		if (arr == null || arr.length == 0) {
			return null;
		}
		
		T elementoMenor = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (elementoMenor.compareTo(arr[i]) > 0) {
				elementoMenor = arr[i];
			}
		}
		return elementoMenor;
	}
}

class Empleado {
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