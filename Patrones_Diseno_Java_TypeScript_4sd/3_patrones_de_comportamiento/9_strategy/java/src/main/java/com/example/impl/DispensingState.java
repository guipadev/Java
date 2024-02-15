package com.example.impl;

import com.example.api.VendingMachineState;

public class DispensingState implements VendingMachineState {
	
	@Override
    public void insertMoney() {
        System.out.println("Dinero ya insertado, espere...");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Dinero devuelto");
    }

    @Override
    public void selectBeverage() {
        System.out.println("Bebida seleccionada, espere...");
    }

    @Override
    public void dispense() {
        System.out.println("Bebida dispensada");
    }

}
