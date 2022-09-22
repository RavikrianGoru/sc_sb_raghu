package com.example.demo.runners;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class JdbcConnectionCheckRunner implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jt;
	
	@Autowired
	private DataSource ds;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Welcome to Spring Boot JDBC");
		System.out.println(ds);
		System.out.println(jt);
	}
}

