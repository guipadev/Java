package com.example.api;

public interface VendingMachineState {

	void insertMoney();
    void ejectMoney();
    void selectBeverage();
    void dispense();
}
