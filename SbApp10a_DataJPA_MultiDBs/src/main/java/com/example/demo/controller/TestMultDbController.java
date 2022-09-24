package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db1.entity.Customer;
import com.example.demo.db1.repo.CustomerRepository;
import com.example.demo.db2.entity.Product;
import com.example.demo.db2.repo.ProductRepository;


@RestController
public class TestMultDbController {

	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CustomerRepository cRepo;

	@GetMapping("/products")
	private List<Product> getAllProducts()
	{
		return pRepo.findAll();
	}

	@GetMapping("/customers")
	private List<Customer> getAllCustomers()
	{
		return cRepo.findAll();
	}
	
	
}
