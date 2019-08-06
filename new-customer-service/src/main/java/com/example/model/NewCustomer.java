package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "newCustomer")
public class NewCustomer {
	
	@Id
	private int id;
	private Customer customer;
	private NewValues newValues;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public NewValues getNewValues() {
		return newValues;
	}
	public void setNewValues(NewValues newValues) {
		this.newValues = newValues;
	}
	
	
}
