package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public interface CustomerDao extends MongoRepository<Customer, Integer>{

}
