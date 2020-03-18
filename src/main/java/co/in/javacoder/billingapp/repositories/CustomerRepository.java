package co.in.javacoder.billingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import co.in.javacoder.billingapp.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
