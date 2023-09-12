package co.yom.thecodercave.dependencyinjection.di;

import co.yom.thecodercave.dependencyinjection.di.repository.CustomerRepository;
import co.yom.thecodercave.dependencyinjection.di.service.bd.MySQLConnection;
import co.yom.thecodercave.dependencyinjection.di.service.bd.OracleConnection;
import co.yom.thecodercave.dependencyinjection.di.service.send.EmailService;
import co.yom.thecodercave.dependencyinjection.di.service.send.SMSService;


public class  Main {

    public static void main(String[] args) {

        // Aquí inyectamos la dependencia que es el servicio que va enviar el msj al servicio
        // solo cambiamos SMSService por EmailService y se cambia el tipo send
        var sender = new EmailService();

        // Tipo de conexion a realizar, solo cambiar a MySQLConnection o OracleConnection
        var connection = new MySQLConnection();

        // Inyectamos todas las dependencias
        var repository = new CustomerRepository(connection);
        var customerService = new CustomerService(repository);
        var comunicationService = new ComunicationService(sender);

        var customers = customerService.GetCustomers();

        var message = "Message to broadcast to all customers";

        for (var customer : customers) {
            comunicationService.SendMessage(customer, message);
        }
    }
}
