package com.pildo._20programaciongenericaArrayList.herenciasytiposComodin;

public class HerenciaGenericos {

	public static void main(String[] args) {
		
		//Herencia normal
		/*
		Empleado Administrativa = new Empleado("Elena", 45, 2500);
		
		Jefe DirectorComercial = new Jefe("Ana", 30, 2600);
		
		Empleado nuevoEmpleado = DirectorComercial;
		*/
		
		//Herencia Generica
		ClaseGenericaPareja<Empleado> Administrativa = new ClaseGenericaPareja<Empleado>();
		ClaseGenericaPareja<Jefe> DirectorComercial = new ClaseGenericaPareja<Jefe>();
	
		ClaseGenericaPareja.imprimirTrabajador(Administrativa);
		
		ClaseGenericaPareja.imprimirTrabajador(DirectorComercial);
	}

}
