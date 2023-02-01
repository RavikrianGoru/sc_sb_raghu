package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/home")
public class EmpController {

	@GetMapping(path = "/emp")
	public String getEmpName(Model model)
	{
		model.addAttribute("empname", "RaviKiran");
		return "EmpData";
	}
}
