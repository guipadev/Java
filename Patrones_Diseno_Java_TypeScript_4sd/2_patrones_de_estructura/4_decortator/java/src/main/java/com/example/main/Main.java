package com.example.main;

import com.example.api.Coffee;
import com.example.impl.MilkDecorator;
import com.example.impl.SimpleCoffee;

public class Main {

	public static void main(String[] args) {
		// Pedimos un café simple
		Coffee simpleCoffee = new SimpleCoffee();
		System.out.println("Café simple cost: $" + simpleCoffee.cost());

		System.out.println("Description: " + simpleCoffee.getDescription());

		// Pedimos un café con leche
		Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);

		System.out.println("Café con leche cost: $" + coffeeWithMilk.cost());
		System.out.println("Description: " + coffeeWithMilk.getDescription());


	}

}
