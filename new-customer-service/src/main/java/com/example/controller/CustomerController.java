package com.example.controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.NewCustomer;
import com.example.service.NewCustomerService;

@RestController
@RequestMapping(value= "/customer")
public class CustomerController {

	@Autowired
	NewCustomerService newCustomerService;

	@Value("${new.values.service.get.url}")
    private String newValuesServiceGetUrl;
	
	 @Autowired
	 private RestTemplate restTemplate;
	 
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@PostMapping(value= "/create")
	public String create(@RequestBody List<NewCustomer> newCustomer) {
		logger.debug("Saving customers.");
		newCustomerService.createNewCustomer(newCustomer);
		return "Customer records created.";
	}

	@PostMapping(value= "/createNewCustomerById")
	public String createNewCustomerById(@RequestBody String id) {
		logger.debug("Saving customers.");
		
		NewCustomer newCustomer = restTemplate.getForObject(newValuesServiceGetUrl + id, NewCustomer.class);
		
		newCustomerService.updateNewCustomer(newCustomer);
		return "Customer records created.";
	}

	@GetMapping(value= "/getall")
	public Collection<NewCustomer> getAll() {
		logger.debug("Getting all customers.");
		return newCustomerService.getAllNewCustomers();
	}


	/*
	 * @GetMapping(value= "/get/{customer-id}") public Optional<CustomerValues>
	 * getById(@PathVariable(value= "customer-id") int id) {
	 * logger.debug("Getting customer with customer-id= {}.", id); int newId=0;
	 * Customer customer =
	 * restTemplate.getForObject("http://localhost:8102/customer/get/" + id,
	 * Customer.class);
	 * 
	 * System.out.println("CUstomer-ID = " + customer.getPhoneNumber());
	 * if(Objects.nonNull(customer)) { newId =
	 * Integer.parseInt(customer.getPhoneNumber()); } return
	 * customerService.findCustomerValuesById(newId); }
	 */

	@GetMapping(value= "/get/{customer-id}")
	public NewCustomer getById(@PathVariable(value= "customer-id") int id) {
		logger.debug("Getting customer with customer-id= {}.", id);

		NewCustomer newCustomer = restTemplate.getForObject(newValuesServiceGetUrl + id, NewCustomer.class);

		 return newCustomer;
	}
	

	@PutMapping(value= "/update/{customer-id}")
	public String update(@PathVariable(value= "customer-id") int id, @RequestBody NewCustomer newCustomer) {
		logger.debug("Updating customer with customer-id= {}.", id);
		newCustomer.setId(id);
		newCustomerService.updateNewCustomer(newCustomer);
		return "Customer record for customer-id= " + id + " updated.";
	}


	@DeleteMapping(value= "/delete/{customer-id}")
	public String delete(@PathVariable(value= "customer-id") int id) {
		logger.debug("Deleting customer with customer-id= {}.", id);
		newCustomerService.deleteNewCustomerById(id);
		return "Customer record for customer-id= " + id + " deleted.";
	}


	@DeleteMapping(value= "/deleteall")
	public String deleteAll() {
		logger.debug("Deleting all customers.");
		newCustomerService.deleteAllNewCustomers();
		return "All customer records deleted.";
	}
}