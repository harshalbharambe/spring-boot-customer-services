package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "newValues")
public class NewValues {
	
	@Id
	private int id;
	private String newParameter1;
	private String newParameter2;
	private String newParameter3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNewParameter1() {
		return newParameter1;
	}

	public void setNewParameter1(String newParameter1) {
		this.newParameter1 = newParameter1;
	}

	public String getNewParameter2() {
		return newParameter2;
	}

	public void setNewParameter2(String newParameter2) {
		this.newParameter2 = newParameter2;
	}

	public String getNewParameter3() {
		return newParameter3;
	}

	public void setNewParameter3(String newParameter3) {
		this.newParameter3 = newParameter3;
	}

}
