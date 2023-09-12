package co.yom.thecodercave.dependencyinjection.notdi.services;

import co.yom.thecodercave.dependencyinjection.notdi.MySQLConnection;
import co.yom.thecodercave.dependencyinjection.notdi.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Este repository tiene conexion a MySQL, el cual se crea en el constructor
 * Y luego se utiliza para comparar
 */
public class CustomerRepository {

    /**
     * Este repositorio tiene una dependencia con MySQL, pero si necesitamos conectarnos a otra
     * BD Oracle, Postgress debemos crear una nueva clase e inyectar sobre el tipo necesario conexion
     */
    private final MySQLConnection connection;

    public CustomerRepository(MySQLConnection connection) {
        this.connection = connection;
    }

    public List<Customer> GetCustomers() {
        if (connection instanceof MySQLConnection) {
            System.out.println("Get Customers from MySQL");
        }

        // Lista de clientes que se devuelven
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "John Wick", "john@wick.com", "0273487620"));
        customers.add(new Customer(2, "Eastwood", "clint@ew.com","024840972"));

        return customers;
    }
}
