package com.example.impl;

import com.example.api.Coffee;

public class SimpleCoffee implements Coffee {

	@Override
	public double cost() {
		return 2.0; // Un café simple cuesta $2.00
	}

	@Override
	public String getDescription() {
		return "Café simple";
	}

}
