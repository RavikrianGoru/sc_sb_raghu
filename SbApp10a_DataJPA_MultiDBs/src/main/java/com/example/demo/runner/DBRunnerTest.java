package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.db1.entity.Customer;
import com.example.demo.db1.repo.CustomerRepository;
import com.example.demo.db2.entity.Product;
import com.example.demo.db2.repo.ProductRepository;

@Component
public class DBRunnerTest implements CommandLineRunner {

	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CustomerRepository cRepo;
	
	@Override
	public void run(String... args) throws Exception {

		//insert DB1
		pRepo.save(new Product(101,"M_001","iPhone14"));
		pRepo.save(new Product(102,"M_002","OnePlus1"));
		
		//insert DB2
		cRepo.save(new Customer(21,"Ravi","ravi@gmail.com"));
		cRepo.save(new Customer(32,"kiran","kiran@gmail.com"));
		
		//check in DB data inserted or not.
	}

}
