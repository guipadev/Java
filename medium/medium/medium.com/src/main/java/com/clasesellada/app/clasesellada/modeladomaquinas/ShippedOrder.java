package com.medium.EidanKhan.clasesellada.modeladomaquinas;

final class ShippedOrder implements OrderState {
    public void processOrder() {
        System.out.println("Order has been shipped.");
    }
}