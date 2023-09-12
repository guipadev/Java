package co.yom.thecodercave.dependencyinjection.di.repository;

import co.yom.thecodercave.dependencyinjection.di.entity.Customer;

import java.util.List;

public interface IRepository {

    List<Customer> GetCustomers();
}
