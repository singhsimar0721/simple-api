package com.example.simpleapi.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.simpleapi.model.Counter;

public interface CounterRepository extends CrudRepository<Counter, Integer> {

	@Query(value="select max(id) from Counter")
	public int getMaxId();
}
