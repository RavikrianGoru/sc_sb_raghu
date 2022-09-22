package com.example.demo;

import java.io.FileInputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
	
		FileInputStream fis= new FileInputStream("C:\\Users\\LENOVO\\Downloads\\ravi.jpg");
		byte[] imgBArray= fis.readAllBytes();
		char[] descCArray= "Hello World. How are you, What are you doing?".toCharArray();
		
		Employee emp = new Employee(100, "ravi", new Date(), new Date(), new Date(), 20000.00, imgBArray, descCArray);
		
		repo.save(emp);
		fis.close();
	}

}
