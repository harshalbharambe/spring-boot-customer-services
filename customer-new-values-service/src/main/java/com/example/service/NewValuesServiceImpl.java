package com.example.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.NewValuesDao;
import com.example.model.NewValues;

@Service
public class NewValuesServiceImpl implements NewValuesService {

	@Autowired
	NewValuesDao newValuesDao;
	
	public void createNewValues(List<NewValues> newValues) {
		newValuesDao.saveAll(newValues);
		
	}

	public Collection<NewValues> getAllNewValues() {
		return newValuesDao.findAll();
	}

	public Optional<NewValues> findNewValuesById(int id) {
		return newValuesDao.findById(id);
	}

	public void deleteNewValuesById(int id) {
		newValuesDao.deleteById(id);
	}

	public void updateNewValues(NewValues newValues) {
		newValuesDao.save(newValues);
	}

	public void deleteAllNewValues() {
		newValuesDao.deleteAll();
	}
}
