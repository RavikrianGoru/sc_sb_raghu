package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Employee;

public interface IEmployeeDao {

	int saveEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(Integer eid);
	int deleteEmployeeByName(String  ename);
	List<Employee> getNEmployees(int n);
	List<Employee> getAllEmployees();
	
}

