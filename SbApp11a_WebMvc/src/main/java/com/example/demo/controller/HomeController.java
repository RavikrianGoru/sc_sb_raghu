package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(path="/home")
	public String getHome(Model model)
	{
		System.out.println(model.getClass().getName());
		model.addAttribute("title", "ABC Home Pvt");
		return "Home";
	}

}
