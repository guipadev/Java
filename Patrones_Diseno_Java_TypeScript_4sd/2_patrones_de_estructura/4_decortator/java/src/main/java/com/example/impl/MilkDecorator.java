package com.example.impl;

import com.example.api.Coffee;

public class MilkDecorator implements Coffee {

	private final Coffee coffee;

	public MilkDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public double cost() {
		//Agregamos el costo de la leche al costo base del café
		return coffee.cost() + 1.0; // La leche cuesta $1.00 extra
	}

	@Override
	public String getDescription() {
        //Agregamos "con leche" a la descripción del café
        return coffee.getDescription() + " con leche";
    }


}
