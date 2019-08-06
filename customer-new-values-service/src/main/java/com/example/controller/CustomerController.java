package com.example.controller;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

import com.example.model.Customer;
import com.example.model.NewCustomer;
import com.example.model.NewValues;
import com.example.service.NewValuesService;

@RestController
@RequestMapping(value= "/customer")
public class CustomerController {

	@Autowired
	NewValuesService newValuesService;

	 @Autowired
	 private RestTemplate restTemplate;
	 
	    @Value("${customer.service.get.url}")
	    private String customerServiceGetUrl;
	    
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@PostMapping(value= "/create")
	public String create(@RequestBody List<NewValues> newValues) {
		logger.debug("Saving customers.");
		newValuesService.createNewValues(newValues);
		return "Customer records created.";
	}


	@GetMapping(value= "/getall")
	public Collection<NewValues> getAll() {
		logger.debug("Getting all customers.");
		return newValuesService.getAllNewValues();
	}

	@GetMapping(value= "/getNewCustomer/{customer-id}")
	public NewCustomer getNewCustomerById(@PathVariable(value= "customer-id") int id) {
		logger.debug("Getting customer with customer-id= {}.", id);
		
		int newId=0;
		 
		Customer customer = restTemplate.getForObject(customerServiceGetUrl + id, Customer.class);
		 
		 if(Objects.nonNull(customer)) {
			newId = customer.getId();
		 }
		 
		 NewValues newValues = newValuesService.findNewValuesById(newId).get();
		 NewCustomer newCustomer =new NewCustomer();
		 
		 newCustomer.setCustomer(customer);
		 newCustomer.setNewValues(newValues);
		
		 return newCustomer;
	}
	
	@GetMapping(value= "/get/{customer-id}")
	public Optional<NewValues> getById(@PathVariable(value= "customer-id") int id) {
		logger.debug("Getting customer with customer-id= {}.", id);
		return newValuesService.findNewValuesById(id);
	}
	
	@PutMapping(value= "/update/{customer-id}")
	public String update(@PathVariable(value= "customer-id") int id, @RequestBody NewValues newValues) {
		logger.debug("Updating customer with customer-id= {}.", id);
		newValues.setId(id);
		newValuesService.updateNewValues(newValues);
		return "Customer record for customer-id= " + id + " updated.";
	}


	@DeleteMapping(value= "/delete/{customer-id}")
	public String delete(@PathVariable(value= "customer-id") int id) {
		logger.debug("Deleting customer with customer-id= {}.", id);
		newValuesService.deleteNewValuesById(id);
		return "Customer record for customer-id= " + id + " deleted.";
	}


	@DeleteMapping(value= "/deleteall")
	public String deleteAll() {
		logger.debug("Deleting all customers.");
		newValuesService.deleteAllNewValues();
		return "All customer records deleted.";
	}
}