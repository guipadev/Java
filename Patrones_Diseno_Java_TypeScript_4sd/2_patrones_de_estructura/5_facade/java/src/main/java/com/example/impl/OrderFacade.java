package com.example.impl;

import java.util.List;

public class OrderFacade {

	private InventorySystem inventorySystem;
	private PaymentSystem paymentSystem;
	private ShippingSystem shippingSystem;

	public OrderFacade() {
		inventorySystem = new InventorySystem();
		paymentSystem = new PaymentSystem();
		shippingSystem = new ShippingSystem();
	}

	public void placeOrder(List<String> items, double amount) {
		// Verificar el inventario
		inventorySystem.checkInventory(items);

		// Procesar el pago
		paymentSystem.processPayment(amount);

		// Enviar el pedido
		shippingSystem.shipOrder(items);

		System.out.println("Pedido completado con éxito.");
	}

}
