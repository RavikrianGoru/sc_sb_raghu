package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

//@Lazy
@Component("dataBaseConnection")
@Scope("singleton")
@ToString
public class DataBaseConnection {

	@Value("orcl")
	private String dbName;
	
	@Value("orcl-jdbc")
	private String url;
	
	public DataBaseConnection()
	{
		System.out.println("DataBaseConnection object is created");
	}
}
