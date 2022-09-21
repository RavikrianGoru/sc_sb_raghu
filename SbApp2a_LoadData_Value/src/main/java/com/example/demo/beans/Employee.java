package com.example.demo.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component("empObj")
public class Employee {

	@Value("${my.app.emp.id:10001}")
	private int id;

	@Value("${my.app.emp.name:abcName}")
	private String name;

	@Value("${my.app.emp.sal:100000.00}")
	private double sal;

	@Value("${my.app.emp.qualfs:Btech,MBA}")
	private String[] qualfs;

	@Value("${my.app.emp.mgrs:X-Manager X,Y-Manager Y}")
	private List<String> mgrs;
	
	@Value("${my.app.emp.mnos:8888888888,9999999999}")
	private Set<String> mnos;

	@Value("#{${my.app.emp.exps}}")
	private Map<String, String> exps;

	@Value("#{${my.app.emp.exps}.DBS}")
	private String currentExp;

	@Autowired
	private Address addr;

}
