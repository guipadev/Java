package com.pildo._20programaciongenericaArrayList.creacionClasesGenericas;

public class ClaseGenericaPareja<T> {
	
	private T primero;
	
	public ClaseGenericaPareja() {
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}

}
