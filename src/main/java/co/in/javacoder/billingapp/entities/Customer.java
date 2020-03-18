package co.in.javacoder.billingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "customer_name")
	private String name;

	@Column(name = "gst_number")
	private String gstNumber;

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
}
