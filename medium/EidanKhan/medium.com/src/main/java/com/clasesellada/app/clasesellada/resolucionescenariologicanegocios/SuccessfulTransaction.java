package com.medium.EidanKhan.clasesellada.resolucionescenariologicanegocios;

final class SuccessfulTransaction extends TransactionResult {
    private final double amount;

    public SuccessfulTransaction(double amount) {
        this.amount = amount;
    }

    public void processTransaction() {
        System.out.println("Transaction successful. Amount: " + amount);
    }
}
