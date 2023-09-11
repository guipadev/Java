package co.yom.thecodercave.dependencyinjection.notdi.services;

import co.yom.thecodercave.dependencyinjection.notdi.Customer;

import java.security.MessageDigest;

/**
 * Impresión de mensaje por pantalla
 */
public class EmailService {

    public void Send(Customer customer, String message) {
        System.out.printf("MessageDigest sent to " + customer.Name + " by email");
    }
}
