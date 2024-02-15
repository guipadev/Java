package com.medium.EidanKhan.clasesellada.modeladomaquinas;

final class NewOrder implements OrderState {
    public void processOrder() {
        System.out.println("Processing new order...");
    }
}