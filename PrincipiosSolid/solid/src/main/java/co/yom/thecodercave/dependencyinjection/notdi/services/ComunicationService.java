package co.yom.thecodercave.dependencyinjection.notdi.services;

import co.yom.thecodercave.dependencyinjection.notdi.Customer;

/**
 * Este servicio tiene un emailService al cual se envia por email los mensajes
 * Esta clase tiene una dependencia, respecto a la implementación de emailService
 * El problema radica si el dia de mañana queremos que la comunicacion se realice por sms
 * tendriamos que cambiar servicio, porque es dependiente del EmailService
 * Osea esta clase en vez de ComunicationService podria llamarse EmailService porque es 100% dependiente
 * Otro problema es que así como esta es dificil realizar un test unitario, ya que no podriamos
 * hacer un mock del servicio porque depende de la implementacion
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
