package co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Order;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.IOrderRepository;

/**
 * Clase con una unica responsabilidad
 * Insertar una orden
 */
public class OrderRepository implements IOrderRepository {
    @Override
    public boolean InsertOrder(Order order) {
        return true;
    }
}
