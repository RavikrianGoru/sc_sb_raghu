package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.bean.Employee;


public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEid(rs.getInt("eid"));
		e.setEname(rs.getString("ename"));
		e.setEsal(rs.getDouble("esal"));
		return e;
	}

}
