package co.yom.thecodercave.singlerseposibilityprinciple.srp.service;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Invoice;

public interface INotificationService {
    boolean EmailInvoice(Invoice invoice);
}
