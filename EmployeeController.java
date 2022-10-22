package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("Employeedata")
	public ArrayList<Employee> getEmp()
	{
		return employeeService.getDataFromDB();
		
	}
}
