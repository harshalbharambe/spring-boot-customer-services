package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.NewValues;

@Repository
public interface NewValuesDao extends MongoRepository<NewValues, Integer>{

}
