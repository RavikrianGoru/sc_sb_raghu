package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entiry.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		List<String> versions=Arrays.asList("1A","2B");
		Set<String> projects= new HashSet<>();
		projects.add("P1");
		projects.add("P2");
		
		Map<String,String> clients= new HashMap<>();
		clients.put("C1", "NIT");
		clients.put("C2", "ABC");
		
		Employee emp=new Employee(100,"ravi",versions,projects,clients);
		
		repo.save(emp);
	}

}
