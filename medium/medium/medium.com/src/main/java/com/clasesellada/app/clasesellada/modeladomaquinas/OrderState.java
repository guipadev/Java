package com.medium.EidanKhan.clasesellada.modeladomaquinas;

sealed interface OrderState permits NewOrder, ShippedOrder, DeliveredOrder {
    void processOrder();
}