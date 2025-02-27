package co.yom.thecodercave.dependencyinjection.notdi;

import co.yom.thecodercave.dependencyinjection.notdi.services.CustomerRepository;
import co.yom.thecodercave.dependencyinjection.notdi.services.CustomerService;
import co.yom.thecodercave.dependencyinjection.notdi.services.ComunicationService;
import co.yom.thecodercave.dependencyinjection.notdi.services.EmailService;

/**
 * A partir de una lista de clientes que tiene una BD, queremos enviarles determinados mensajes
 *
 */
public class Main {

    public static void main(String[] args) {

        // Servicio clientes
        var mysqlConnection = new MySQLConnection("localhost", "root", "", 3306, "mydb");
        var customerRepository = new CustomerRepository(mysqlConnection);
        var customerService = new CustomerService(customerRepository);
        // Servicio comunicacion
        var emailService = new EmailService();
        var communicationService = new ComunicationService(emailService);


        // Obtención de clientes
        var customers = customerService.GetCustomers();

        var message = "Message to broadcast to all customers";

        for (var customer : customers) {
            // Servicio comunicación, encargado enviar mensaje para c/u de los clientes
            communicationService.SendMessage(customer, message);
        }
    }
}
