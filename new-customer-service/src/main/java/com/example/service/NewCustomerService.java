package com.example.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.model.NewCustomer;

public interface NewCustomerService {

	public void createNewCustomer(List<NewCustomer> newCustomer);

	public Collection<NewCustomer> getAllNewCustomers();

	public Optional<NewCustomer> findNewCustomerById(int id);

	public void deleteNewCustomerById(int id);

	public void updateNewCustomer(NewCustomer newCustomer);

	public void deleteAllNewCustomers();
}