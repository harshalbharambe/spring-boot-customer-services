package com.example.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.model.NewValues;

public interface NewValuesService {

	public void createNewValues(List<NewValues> newValues);

	public Collection<NewValues> getAllNewValues();

	public Optional<NewValues> findNewValuesById(int id);

	public void deleteNewValuesById(int id);

	public void updateNewValues(NewValues newValues);

	public void deleteAllNewValues();
}