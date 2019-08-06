package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.NewCustomer;

@Repository
public interface NewCustomerDao extends MongoRepository<NewCustomer, Integer>{

}
