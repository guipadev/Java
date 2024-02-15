package com.example.impl;

import com.example.api.VendingMachineState;

public class VendingMachine {

	private VendingMachineState state;

	public VendingMachine() {
		state = new NoMoneyState();
		/*
		 * Inicialmente, la máquina está en el estado "Sin dinero"
		 */
	}

	public void insertMoney() {
		state.insertMoney();
		if (state instanceof NoMoneyState) {
			state = new SelectingBeverageState();
		}
	}

	public void ejectMoney() {
		state.ejectMoney();
		if (state instanceof SelectingBeverageState) {
			state = new NoMoneyState();
		}
	}

	public void selectBeverage() {
		state.selectBeverage();
		if (state instanceof SelectingBeverageState) {
			state = new DispensingState();
		}
	}

	public void dispense() {
		state.dispense();
		if (state instanceof DispensingState) {
			state = new NoMoneyState();
		}
	}
}
