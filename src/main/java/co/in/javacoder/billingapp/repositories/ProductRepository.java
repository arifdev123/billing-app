package co.in.javacoder.billingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.in.javacoder.billingapp.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
