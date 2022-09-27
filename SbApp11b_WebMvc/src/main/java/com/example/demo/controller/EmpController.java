package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController 
{
	// URL: http://localhost:8080/emp?empId=101&empName="Ravi"&empSal=6000
	// URL: http://localhost:8080/emp?empId=101&empName="Ravi"

	@GetMapping(path = "/emp")
	public String getEmpData(
			@RequestParam("empId")  Integer eId,
			@RequestParam(value="empName")  String eName,
			@RequestParam(value="empSal" , required = false, defaultValue = "1000.00")  Double eSal,
			Model model            //send data to UI
			)
	{
		System.out.print("Employee details"+eId+"-"+eName+"-"+eSal);
		model.addAttribute("empId", eId);
		model.addAttribute("empName", eName);
		model.addAttribute("empSal", eSal);
		return "EmpData";//view Name
	}
	
	//http://localhost:8080/delete?eId=101
	//will redirect to http://localhost:8080/emp?empId=101&empName=Raju&empSal=50000.0
	@GetMapping(path="/delete")
	public String deleteEmpData(
			@RequestParam(value="eId") Integer eId,
			Model model //send data to UI
			)
	{
		System.out.println("Employee Delete called....");
		String eName="Raju";
		Double eSal=50000.00;
		model.addAttribute("empId", eId);
		model.addAttribute("empName",eName);
		model.addAttribute("empSal", eSal);
		return "redirect:emp?empId="+eId+"&empName="+eName+"&empSal="+eSal;
	}
}
