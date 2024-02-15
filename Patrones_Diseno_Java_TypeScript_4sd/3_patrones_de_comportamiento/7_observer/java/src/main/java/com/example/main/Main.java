package com.example.main;

import com.example.impl.Investor;
import com.example.impl.Stock;

public class Main {

	public static void main(String[] args) {
		// Crear acciones
		Stock appleStock = new Stock("AAPL", 150.0);
		Stock googleStock = new Stock("GOOGL", 2500.0);

		// Crear inversores
		Investor investor1 = new Investor("Inversor 1");
		Investor investor2 = new Investor("Inversor 2");

		// Registrar inversores como observadores
		appleStock.addObserver(investor1);
		appleStock.addObserver(investor2);
		googleStock.addObserver(investor2);

		/*
		 * Simular cambios en los precios de las acciones
		 */
		appleStock.setPrice(155.0);
		googleStock.setPrice(2600.0);
	}

}
