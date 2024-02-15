package com.medium.EidanKhan.clasesellada.resolucionescenariologicanegocios;

sealed class TransactionResult permits SuccessfulTransaction, FailedTransaction {
    abstract void processTransaction();
}
