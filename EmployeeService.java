package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public ArrayList<Employee> getDataFromDB()
	{
		return employeeDao.getDataFromDB();
		
	}

	
	
}
