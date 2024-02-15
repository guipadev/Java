package com.example.main;

import com.example.api.PaymentService;
import com.example.impl.CreditCardPayment;
import com.example.impl.PaymentAdapter;

public class Main {

	public static void main(String[] args) {
		// Utilizando el adaptador para realizar un pago
		CreditCardPayment creditCardPayment = new CreditCardPayment();

		PaymentService paymentService = new PaymentAdapter(creditCardPayment);

		paymentService.processPayment(100.00);

	}

}
