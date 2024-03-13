package com.example.demo.runners;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Order(1)
public class JdbcConnectionCheckRunner implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jt;
	
	@Autowired
	private DataSource ds;

	//@Autowired will not work with static fields
	private static JdbcTemplate staticJt;
	private static DataSource staticDs;

	@PostConstruct
	public void initStatic()
	{
		staticJt=jt;
		staticDs=ds;
	}
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Welcome to Spring Boot JDBC");
		System.out.println("Datasource: "+ds);
		System.out.println("JDBCTemplate: "+jt);
		System.out.println("satic fields initialize with PostConstruct staticJt "+staticJt);
		System.out.println("satic fields initialize with PostConstruct staticDs "+staticDs);
	}
}

