package com.mitocode.patronesdedisenio._10observer.observer;

public class SolObservador extends Observador{

	private double valorCambio = 3.25;
	
	public SolObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("PEN: " + (sujeto.getEstado() * valorCambio));
	}

}
