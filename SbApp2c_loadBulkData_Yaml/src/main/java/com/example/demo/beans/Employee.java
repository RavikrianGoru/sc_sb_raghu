package com.example.demo.beans;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component("empObj")
@ConfigurationProperties(prefix="my.app.emp")
public class Employee {

	private int id;

	private String name;

	private double sal;

	private String[] qualfs;

	private List<String> mgrs;
	
	private Set<String> mnos;

	private LinkedHashMap<String, String> exps;


	@Autowired
	private Address addr;

}
