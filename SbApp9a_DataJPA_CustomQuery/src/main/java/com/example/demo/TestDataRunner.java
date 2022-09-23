package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repo.DeparmentRepo;
import com.example.demo.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository eRepo;

	@Autowired
	private DeparmentRepo dRepo;
	@Override
	public void run(String... args) throws Exception {

		Department d1= new Department(10, "QA");
		Department d2= new Department(20, "UAT");
		Department d3= new Department(30, "ADMIN");
		Department d4= new Department(40, "ACCT");
		dRepo.save(d1);
		dRepo.save(d2);
		dRepo.save(d3);
		dRepo.save(d4);
		
		//save a few records
		eRepo.save(new Employee(101,"ravi",5000.00,d1));
		eRepo.save(new Employee(102,"kavi",6500.00,d2));
		eRepo.save(new Employee(103,"Raju",7500.00,d3));
		eRepo.save(new Employee(104,"Raju",8800.00,d4));
		eRepo.save(new Employee(105,"Raju",8500.00,d1));
		
		//Query: select empName from Employee
		eRepo.getAllEmpNames().forEach(System.out::println);
		
		//Query:  select e.empId, e.empName from Employee e where e.empSal>6000.00
		eRepo.getEmpIDEmpNameForSalGt6k().stream().map(each->each[0]+"  "+each[1]).forEach(System.out::println);
		
		//Query: select e from Employee e
		eRepo.getAllEmployeers().forEach(System.out::println);
		
		//Query: select e from Employee e where e.empSal>:sal
		eRepo.getAllEmployeersEmpSalGtValue(5999.00).forEach(System.out::println);
		
		//SQl: SELECT ename FROM emp_tab 
		eRepo.getAllEmpNamesSql().forEach(System.out::println);

		//SQl: SELECT ename FROM emp_tab WHERE esal > ?1 
		eRepo.getAllEmpNamesBySalGtSql(6000.00).forEach(System.out::println);
		
		
		//======JOINS======
		eRepo.getEmpIdNameDepNameByDid(10).stream().map(obj->obj[0]+"-"+obj[1]).forEach(System.out::println);
	}

}
