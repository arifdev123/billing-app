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
public class Stock {
	@Id
	@Column(name = "stock_entry_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int entryID;

	@Column(name = "gst_percentage")
	private int gstInPercentage;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "product_price")
	private double productPrice;

	@Column(name = "date_of_purchase")
	private LocalDate datePurchased;

	@OneToOne
	@JoinColumn(name = "product_product_id")
	private Product product;

	@OneToOne
	@JoinColumn(name = "supplier_supplier_id")
	private Supplier supplier;

	public Stock() {

	}

	public int getEntryID() {
		return entryID;
	}

	public int getGstInPercentage() {
		return gstInPercentage;
	}

	public void setGstInPercentage(int gstInPercentage) {
		this.gstInPercentage = gstInPercentage;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(LocalDate datePurchased) {
		this.datePurchased = datePurchased;
	}

	public Product getProductID() {
		return product;
	}

	public void setProductID(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplierID(Supplier supplier) {
		this.supplier = supplier;
	}
}
