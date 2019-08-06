package com.example.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping(value= "/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@PostMapping(value= "/create")
	public String create(@RequestBody List<Customer> customers) {
		logger.debug("Saving customers.");
		customerService.createCustomer(customers);
		return "Customer records created.";
	}


	@GetMapping(value= "/getall")
	public Collection<Customer> getAll() {
		logger.debug("Getting all customers.");
		return customerService.getAllCustomers();
	}


	@GetMapping(value= "/get/{customer-id}")
	public Optional<Customer> getById(@PathVariable(value= "customer-id") int id) {
		logger.debug("Getting customer with customer-id= {}.", id);
		return customerService.findCustomerById(id);
	}


	@PutMapping(value= "/update/{customer-id}")
	public String update(@PathVariable(value= "customer-id") int id, @RequestBody Customer customer) {
		logger.debug("Updating customer with customer-id= {}.", id);
		customer.setId(id);
		customerService.updateCustomer(customer);
		return "Customer record for customer-id= " + id + " updated.";
	}


	@DeleteMapping(value= "/delete/{customer-id}")
	public String delete(@PathVariable(value= "customer-id") int id) {
		logger.debug("Deleting customer with customer-id= {}.", id);
		customerService.deleteCustomerById(id);
		return "Customer record for customer-id= " + id + " deleted.";
	}


	@DeleteMapping(value= "/deleteall")
	public String deleteAll() {
		logger.debug("Deleting all customers.");
		customerService.deleteAllCustomers();
		return "All customer records deleted.";
	}
}