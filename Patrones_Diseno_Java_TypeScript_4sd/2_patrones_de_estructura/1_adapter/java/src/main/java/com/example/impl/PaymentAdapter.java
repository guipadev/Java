package com.example.impl;

import com.example.api.PaymentService;

public class PaymentAdapter implements PaymentService {

	private CreditCardPayment creditCardPayment;

	public PaymentAdapter(CreditCardPayment creditCardPayment) {
		this.creditCardPayment = creditCardPayment;
	}

	public void processPayment(double amount) {
		creditCardPayment.makePayment(amount);
	}

}
