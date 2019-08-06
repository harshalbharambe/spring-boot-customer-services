package com.example.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void createCustomer(List<Customer> customers) {
		customerDao.saveAll(customers);
		
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Optional<Customer> findCustomerById(int id) {
		return customerDao.findById(id);
	}

	@Override
	public void deleteCustomerById(int id) {
		customerDao.deleteById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void deleteAllCustomers() {
		customerDao.deleteAll();
	}

}
