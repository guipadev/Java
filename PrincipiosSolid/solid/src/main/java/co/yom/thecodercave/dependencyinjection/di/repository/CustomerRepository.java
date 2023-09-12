package co.yom.thecodercave.dependencyinjection.di.repository;

import co.yom.thecodercave.dependencyinjection.di.entity.Customer;
import co.yom.thecodercave.dependencyinjection.di.service.bd.IDbConnection;
import co.yom.thecodercave.dependencyinjection.di.service.bd.MySQLConnection;
import co.yom.thecodercave.dependencyinjection.di.service.bd.OracleConnection;

import java.util.ArrayList;
import java.util.List;

// Implementar la interface para utilizar el metodo de lista customer
public class CustomerRepository implements IRepository {

    // Inyectamos dependencia en repositorio, en vez de tener una clase concreta
    private final IDbConnection connection;

    // Pasamos la abstracción como parametro
    public CustomerRepository(IDbConnection connection) {

        this.connection = connection;
    }


    @Override
    public List<Customer> GetCustomers() {

        // Indicar la conexiónn a que tipo BD fue realizada
        if (connection instanceof MySQLConnection) {
            System.out.println("Get Customers from MySQL");
        } else if (connection instanceof OracleConnection) {
            System.out.println("Get Customers from Oracle");
        }

        // Lista de clientes que se devuelven
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "John Wick", "john@wick.com", "0273487620"));
        customers.add(new Customer(2, "Eastwood", "clint@ew.com","024840972"));

        return customers;
    }
}
