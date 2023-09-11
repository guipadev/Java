package co.yom.thecodercave.dependencyinjection.notdi.services;

import co.yom.thecodercave.dependencyinjection.notdi.Customer;

/**
 * Este servicio tiene un emailService al cual se envia por email los mensajes
 */
public class ComunicationService {
    private final EmailService emailService;

    public ComunicationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void SendMessage(Customer customer, String message) {
        emailService.Send(customer, message);
    }
}
