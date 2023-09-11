package co.yom.thecodercave.singlerseposibilityprinciple.srp.service;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Order;

public interface IOrderRepository {

    public boolean InsertOrder(Order order);
}
