package com.example.main;

import com.example.api.Handler;
import com.example.impl.Director;
import com.example.impl.JuniorManager;
import com.example.impl.PurchaseRequest;
import com.example.impl.SeniorManager;

public class Main {

	public static void main(String[] args) {
		Handler jrManager = new JuniorManager();
		Handler seniorManager = new SeniorManager();
		Handler director = new Director();
		jrManager.setNextHandler(seniorManager);
		seniorManager.setNextHandler(director);

		// Simulamos una solicitud de compra
		var purchaseAmount = 10000; //cambia este valor para probar la lógica
		var request1 = new PurchaseRequest(purchaseAmount);

		// Procesamos la solicitud
		jrManager.processRequest(request1);
	}

}
