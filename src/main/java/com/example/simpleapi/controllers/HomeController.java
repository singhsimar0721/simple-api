package com.example.simpleapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleapi.model.Counter;
import com.example.simpleapi.repo.CounterRepository;

@RestController
@RequestMapping("/services")
public class HomeController {
	@Autowired
	CounterRepository repo;

	/**
	 * Home Controller
	 * @return
	 */
	@GetMapping("/greet")
	public String greeting() {
		return "Welcome to Simple API";
	}
	
	@GetMapping("/")
	public int increaseCounter() {
		repo.save(new Counter());
		return repo.getMaxId();
	}
}
