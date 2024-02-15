package com.example.impl;

import com.example.api.VendingMachineState;

public class NoMoneyState implements VendingMachineState {

	@Override
	public void insertMoney() {
		System.out.println("Dinero insertado");
	}

	@Override
	public void ejectMoney() {
		System.out.println("No se puede expulsar dinero, no se ha insertado dinero");
	}

	@Override
	public void selectBeverage() {
		System.out.println("No se puede seleccionar una bebida, inserta dinero primero");
	}

	@Override
	public void dispense() {
		System.out.println("No se puede dispensar una bebida, inserta dinero primero");
	}

}
