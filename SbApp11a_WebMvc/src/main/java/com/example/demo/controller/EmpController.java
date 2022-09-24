package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;

@Controller//Component + Web
public class EmpController {
	
	//1.
	//@RequestMapping(path="/emp/show", method = RequestMethod.GET) --> old style
	@GetMapping(path = "/emp/show")
	public String showEmpHome()
	{
		return "EmpHome";
	}
	
	
	//2. register form
	@GetMapping(path = "/emp/register")
	public String showRegisterPage()
	{
		return "EmpRegister";
	}

	//3. Read Dat
	@PostMapping(path = "/emp/save")
	public String readEmployeeData(
			@ModelAttribute Employee employee,
			Model model)
	{
		System.out.println(employee);
		model.addAttribute(employee);
		return "EmpData";
	}

}
