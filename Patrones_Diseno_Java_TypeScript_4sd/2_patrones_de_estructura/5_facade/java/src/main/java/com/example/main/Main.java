package com.example.main;

import java.util.Arrays;
import java.util.List;

import com.example.impl.OrderFacade;

public class Main {

	public static void main(String[] args) {
		OrderFacade orderFacade = new OrderFacade();
		List<String> items = Arrays.asList("Producto1", "Producto2");
		double amount = 100.0;

		orderFacade.placeOrder(items, amount);
	}

}
