package co.yom.thecodercave.dependencyinjection.di;

import co.yom.thecodercave.dependencyinjection.di.entity.Customer;
import co.yom.thecodercave.dependencyinjection.di.repository.IRepository;
import co.yom.thecodercave.dependencyinjection.notdi.services.CustomerRepository;

import java.util.List;

public class CustomerService {

    // Ahora no tendremos una instancia concreta
    private final IRepository repository;

    // Y recibimos por parametro
    public CustomerService(IRepository repository) {
        this.repository = repository;
    }

    // Se piden todos los clientes
    // No importa cual sea el repositorio desde que exista el método GetCustomers
    // Lo cual es lo solicitado para cumplir con la interface
   public List<Customer> GetCustomers() {
        return repository.GetCustomers();
   }
}
