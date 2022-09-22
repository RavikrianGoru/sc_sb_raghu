package com.example.demo.runners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class EmpJdbcOperationsRunner implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Basic way of SQL operation: CURD by JdbcTemplate object");
		
		/*
		//1. Define SQl query
		String sql1="insert into emp values(?,?,?)";
		
		//2. Execute Query using jt
		int count=jt.update(sql1, 301,"chinna",60000.00);

		//3. print results
		System.out.println("Inserted rows:"+count);
		*/
		
		/*
		String sql1="update emp set ename=?,esal=? where eid=?";
		int count=jt.update(sql1, "Guru",350000.00,301);
		System.out.println("Updated rows:"+count);
		*/
		
		/*
		String sql1="delete from emp where eid=?";
		int count=jt.update(sql1, 301);
		System.out.println("Deleted rows:"+count);
		*/
		
	}
}

