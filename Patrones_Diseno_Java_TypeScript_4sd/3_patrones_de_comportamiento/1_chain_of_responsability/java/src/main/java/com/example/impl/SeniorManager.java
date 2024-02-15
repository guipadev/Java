package com.example.impl;

import com.example.api.Handler;

public class SeniorManager implements Handler {

	private Handler nextHandler;

	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() <= 5000) {
			System.out.println("Solicitud de compra aprobada por el Senior Manager.");
		} else if (nextHandler != null) {
			nextHandler.processRequest(request);
		} else {
			System.out.println("La solicitud de compra requiere aprobación adicional.");
		}
	}

}
