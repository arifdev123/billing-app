package co.in.javacoder.billingapp.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Invoice {
	@Id
	@Column(name = "invoice_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invoiceID;

	@Column(name = "invoice_dated")
	private LocalDate invoiceDated;

	@OneToOne
	@JoinColumn(name = "product_product_id")
	private Product product;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "sales")
	private double sales;

	@Column(name = "total")
	private double total;

	@OneToOne
	@JoinColumn(name = "customer_customer_id")
	private Customer customer;

	public Invoice() {

	}

	public int getInvoiceID() {
		return invoiceID;
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
