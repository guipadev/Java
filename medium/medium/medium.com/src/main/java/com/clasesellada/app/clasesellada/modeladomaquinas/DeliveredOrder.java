package com.medium.EidanKhan.clasesellada.modeladomaquinas;

final class DeliveredOrder implements OrderState {
    public void processOrder() {
        System.out.println("Order has been delivered.");
    }
}
