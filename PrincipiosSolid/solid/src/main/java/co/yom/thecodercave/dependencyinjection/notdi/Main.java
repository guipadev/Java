package co.yom.thecodercave.dependencyinjection.notdi;

/**
 * A partir de una lista de clientes que tiene una BD, queremos enviarles determinados mensajes
 *
 */
public class Main {

    public static void main(String[] args) {

        // Servicio clientes
        var customerService = new CustomerService();
        // Servicio comunicacion
        var communicationService = new CommunicationService();

        // Obtención de clientes
        var customers = customerService.GetCustomers();

        var message = "Message to broadcast to all customers";

        for (var customer : customers) {
            // Servicio comunicación, encargado enviar mensaje para c/u de los clientes
            communicationService.SendMessage(customer, message);
        }
    }
}
