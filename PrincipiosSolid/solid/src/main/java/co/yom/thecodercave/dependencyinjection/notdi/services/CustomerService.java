package co.yom.thecodercave.dependencyinjection.notdi.services;

import co.yom.thecodercave.dependencyinjection.notdi.Customer;

import java.util.List;

public class CustomerService {

    private final CustomerRepository repository;

    // Se instancia un repositorio de los clientes
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    // Se piden todos los clientes
    public List<Customer> GetCustomers() {
        return repository.GetCustomers();
    }
}
