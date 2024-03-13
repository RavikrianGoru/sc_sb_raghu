package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private JdbcTemplate jt;//Has-A
	
	@Override
	public int saveEmployee(Employee emp) {
		String sql1="insert into emp values(?,?,?)";
		return jt.update(sql1, emp.getEid(),emp.getEname(),emp.getEsal());
	}

	@Override
	public int updateEmployee(Employee emp) {
		String sql1="update emp set ename=?,esal=? where eid=?";
		return jt.update(sql1, emp.getEname(),emp.getEsal(),emp.getEid());
	}

	@Override
	public int deleteEmployee(Integer eid) {
		String sql1="delete from emp where eid=?";
		return jt.update(sql1, eid);
	}

	@Override
	public int deleteEmployeeByName(String ename) {
		String sql1="delete from emp where ename=?";
		return jt.update(sql1, ename);
	}

	@Override
	public List<Employee> getNEmployees(int n) {
		String sql1="select * from emp limit "+n;
		return jt.query(sql1, new EmployeeRowMapper());
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql1="select * from emp";
		return jt.query(sql1, new BeanPropertyRowMapper(Employee.class));
	}

}
