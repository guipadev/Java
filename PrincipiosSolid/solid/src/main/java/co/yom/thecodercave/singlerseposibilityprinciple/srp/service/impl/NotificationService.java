package co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Invoice;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.INotificationService;

/**
 * Responsabilida única
 * de enviar notificaciones por email la factura
 */
public class NotificationService implements INotificationService {
    @Override
    public boolean EmailInvoice(Invoice invoice) {
        return true;
    }
}
