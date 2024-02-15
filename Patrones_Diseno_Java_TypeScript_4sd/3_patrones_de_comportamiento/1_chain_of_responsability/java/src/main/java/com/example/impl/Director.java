package com.example.impl;

import com.example.api.Handler;

public class Director implements Handler {

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() <= 10000) {
			System.out.println("Solicitud de compra aprobada por el Director.");
		} else {
			System.out.println("La solicitud de compra fue rechazada.");
		}
	}

	@Override
	public void setNextHandler(Handler nextHandler) {
		/*
		 * El Director es el último en la cadena, no se establece un próximo manejador.
		 */
	}

}
