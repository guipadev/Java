package com.example.main;

import com.example.impl.VendingMachine;

public class Main {

	public static void main(String[] args) {
		var vendingMachine = new VendingMachine();

        vendingMachine.insertMoney();
        vendingMachine.selectBeverage();
        vendingMachine.dispense();
        
        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();
        
        vendingMachine.selectBeverage();
        vendingMachine.insertMoney();
        vendingMachine.selectBeverage();
        vendingMachine.dispense();
	}

}
