package co.yom.thecodercave.dependencyinjection.di.service.send;

import co.yom.thecodercave.dependencyinjection.di.entity.Customer;

/**
 * Servicio implementan la interface de envio mensaje
 */
public class SMSService implements ISender {

    @Override
    public void Send(Customer customer, String message) {
        System.out.println("Message sent to " + customer.Name + " by sms");
    }
}
