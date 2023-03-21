package com.manuelzapata._2encapsulamientoloquepasaenlasvegas.other;

import com.manuelzapata._2encapsulamientoloquepasaenlasvegas.Invoice;

import java.math.BigDecimal;

public class AnotherInvoice extends Invoice {

    void myMethod() {
        BigDecimal amount = calculateTotal();
        this.addItem("ab", new BigDecimal(1));
        System.out.println(amount);
        //this.items;
    }

}