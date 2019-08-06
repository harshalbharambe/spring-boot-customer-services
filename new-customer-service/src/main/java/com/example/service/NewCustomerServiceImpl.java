package com.example.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NewCustomerDao;
import com.example.model.NewCustomer;

@Service
public class NewCustomerServiceImpl implements NewCustomerService {

	@Autowired
	NewCustomerDao newCustomerDao;
	
	public void createNewCustomer(List<NewCustomer> newCustomer) {
		newCustomerDao.saveAll(newCustomer);
		
	}

	public Collection<NewCustomer> getAllNewCustomers() {
		return newCustomerDao.findAll();
	}

	public Optional<NewCustomer> findNewCustomerById(int id) {
		return newCustomerDao.findById(id);
	}

	public void deleteNewCustomerById(int id) {
		newCustomerDao.deleteById(id);
	}

	public void updateNewCustomer(NewCustomer newCustomer) {
		newCustomerDao.save(newCustomer);
	}

	public void deleteAllNewCustomers() {
		newCustomerDao.deleteAll();
	}
}
