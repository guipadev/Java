package co.yom.thecodercave.dependencyinjection.di.service.send;

import co.yom.thecodercave.dependencyinjection.di.entity.Customer;

/**
 * Interface nos importa solo que envie el mensaje, sin importar de que tipo sea
 * MSM o Email
 */
public interface ISender {

    void Send(Customer customer, String message);
}
