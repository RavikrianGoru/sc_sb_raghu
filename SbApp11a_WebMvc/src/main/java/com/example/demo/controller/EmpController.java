package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//Component + Web
public class EmpController {
	@GetMapping(path = "/emp/show")
	public String showEmpHome()
	{
		return "EmpHome";
	}
}
