package co.in.javacoder.billingapp.repositories;

import org.springframework.data.repository.CrudRepository;

import co.in.javacoder.billingapp.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
