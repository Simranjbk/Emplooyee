package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeLoad {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("load")
	public Employee getLoad()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee = session.load(Employee.class,1 );
		System.out.println(employee);
		tx.commit();
		return employee;
	}

}
