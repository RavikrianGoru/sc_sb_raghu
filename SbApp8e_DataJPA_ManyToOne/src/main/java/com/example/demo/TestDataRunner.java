package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repo.DepartmentRepository;
import com.example.demo.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository eRepo;

	@Autowired
	private DepartmentRepository dRepo;

	@Override
	public void run(String... args) throws Exception {

		Department d1=new Department(101,"Maths");
		Department d2=new Department(105,"Computers");
		dRepo.save(d1);
		dRepo.save(d2);
		
		Employee e1= new Employee(10,"Ravi", d1);
		Employee e2= new Employee(20,"Kiran", d2);
		Employee e3= new Employee(30,"Kumar", d1);
		Employee e4= new Employee(40,"Chinna", d2);
		
		eRepo.save(e1);
		eRepo.save(e2);
		eRepo.save(e3);
		eRepo.save(e4);
		
		
	}

}
