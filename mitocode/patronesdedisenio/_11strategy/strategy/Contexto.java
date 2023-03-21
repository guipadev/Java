package com.mitocode.patronesdedisenio._11strategy.strategy;

public class Contexto {
	
	private IEstrategia estrategia;
	
	public Contexto(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.analizar();
	}

}
