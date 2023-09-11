package co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Invoice;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Order;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.IInvoiceService;

/**
 * Clase única responsabilidad
 * crear la factura
 */
public class InvoiceService implements IInvoiceService {
    @Override
    public Invoice CreateInvoice(Order order) {
        return new Invoice();
    }
}
