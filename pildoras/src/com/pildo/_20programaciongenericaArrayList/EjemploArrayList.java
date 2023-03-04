package com.pildo._20programaciongenericaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		/*
		Empleado listaEmpleados[] = new Empleado[3];
		
		listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
		listaEmpleados[2] = new Empleado("Maria", 25, 2600);
		*/
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		
		//Indicar la capacidad del ArrayList inicial
		//listaEmpleados.ensureCapacity(10);
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 20, 2900));
		//No permite ingresar más datos al ArrayList
		//listaEmpleados.trimToSize();
		
		//incluirlo y reemplazar en posición 1
		listaEmpleados.set(1, new Empleado("Olga", 24, 2750));
		
		//obtener elemento que hay en ArrayList
		//System.out.println(listaEmpleados.get(4).toString());
		
		//System.out.println(listaEmpleados.size());
		
		/*
		for (Empleado parces : listaEmpleados) {
			System.out.println(parces.toString());
		}
		*/
		
		//Iterar sobre ArrayList
		Iterator<Empleado> miIterador = listaEmpleados.iterator();
		
		//hasNext valida si tenemos más objetos dentro de la colleción
		while (miIterador.hasNext()) {
			System.out.println(miIterador.next().toString());
		}
		
		//recorrido con for normal
		/*
		for (int i = 0; i < listaEmpleados.size(); i++) {
			Empleado e = listaEmpleados.get(i);
			System.out.println(e.toString());
		}
		*/
		/*
		System.out.println("------------- Array Convencional  -------------------------");
		//forma larga si no te sientes comodo con ArrayList pasarlo a Array y recorrerlo
		Empleado arrayEmpleado[] = new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleado);
		
		for (int i = 0; i < arrayEmpleado.length; i++) {
			System.out.println(arrayEmpleado[i].toString());
		}
		*/
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

	@Override
	public String toString() {
		return "Empleado se llama " + nombre + ", tiene" + edad + " años, y un salario de $" + salario;
	}
	
	
}