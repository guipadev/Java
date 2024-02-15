package com.medium.EidanKhan.clasesellada.resolucionescenariologicanegocios;

final class FailedTransaction extends TransactionResult {
    private final String errorMessage;

    public FailedTransaction(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void processTransaction() {
        System.out.println("Transaction failed. Reason: " + errorMessage);
    }
}
