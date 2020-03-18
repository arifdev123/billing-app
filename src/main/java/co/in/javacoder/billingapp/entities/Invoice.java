package co.in.javacoder.billingapp.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Invoice {
	@Id
	private int invoiceID;
	private LocalDate invoiceDated;
	private Product product;
	private int quantity;
	private double sales;
	private double total;
	private Customer customer;
	
	public Invoice(){
		
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public LocalDate getInvoiceDated() {
		return invoiceDated;
	}

	public void setInvoiceDated(LocalDate invoiceDated) {
		this.invoiceDated = invoiceDated;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
