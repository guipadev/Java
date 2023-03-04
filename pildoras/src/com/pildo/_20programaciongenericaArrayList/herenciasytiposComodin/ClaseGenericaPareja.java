package com.pildo._20programaciongenericaArrayList.herenciasytiposComodin;

public class ClaseGenericaPareja<T> {
	
	private T primero;
	
	public ClaseGenericaPareja() {
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	// Método aplicación tipo ? comodin, para que se pueda usar Empleado y subclases (jefes, delegados, etc..)
	public static void imprimirTrabajador(ClaseGenericaPareja<? extends Empleado> p) {
		Empleado primero = p.getPrimero();
		System.out.println(primero);
	}
	
	public T getPrimero() {
		return primero;
	}
	
	

}
