package co.in.javacoder.billingapp.repositories;

import org.springframework.data.repository.CrudRepository;

import co.in.javacoder.billingapp.entities.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer> {

}
