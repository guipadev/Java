package co.yom.thecodercave.dependencyinjection.di;

import co.yom.thecodercave.dependencyinjection.di.entity.Customer;
import co.yom.thecodercave.dependencyinjection.di.service.send.ISender;

/**
 * Esta clase solo llamara al servicio que corresponda sms o email
 * invocando al metodo send
 */
public class ComunicationService {

    private final ISender sender;

    // Ya no instanciamos, la dependencia de sender ahora es inyectada a traves del constructor
    // Osea desde la capa de arriba osea Main en este caso vamos a definir cual es el sender
    // se tiene que usar
    public ComunicationService(ISender sender) {
        this.sender = sender;
    }

    public void SendMessage(Customer customer, String message) {

        sender.Send(customer, message);
    }

}
