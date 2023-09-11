package co.yom.thecodercave.singlerseposibilityprinciple.srp.service;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Invoice;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Order;

public interface IInvoiceService {
    Invoice CreateInvoice(Order order);
}
