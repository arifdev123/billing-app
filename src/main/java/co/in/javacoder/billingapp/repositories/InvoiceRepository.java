package co.in.javacoder.billingapp.repositories;

import org.springframework.data.repository.CrudRepository;

import co.in.javacoder.billingapp.entities.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
