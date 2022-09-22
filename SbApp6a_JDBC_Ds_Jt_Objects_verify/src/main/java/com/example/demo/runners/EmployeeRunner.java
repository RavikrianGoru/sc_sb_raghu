package com.example.demo.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.Employee;
import com.example.demo.dao.IEmployeeDao;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeDao dao;
	
	@Override
	public void run(String... args) throws Exception {

		//Insert operation
		dao.saveEmployee(new Employee(100,"RK",35000.00));
		dao.saveEmployee(new Employee(101,"PK",36000.00));
		dao.saveEmployee(new Employee(102,"PL",37000.00));
		dao.saveEmployee(new Employee(103,"GD",38000.00));
		
		//Update
		dao.updateEmployee(new Employee(102,"PLL",3000.00));
		
		//Delete
		dao.deleteEmployee(102);
		dao.deleteEmployeeByName("GD");
	}

}
