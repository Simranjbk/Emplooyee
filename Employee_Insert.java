package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Insert {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("AddData")
	public Employee getEmp()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee= new Employee(1, "sahil");
		Employee employee2=new Employee(2, "samir");
		System.out.println(employee2);
		session.save(employee2);
		tx.commit();
		return employee2;
		
		
	}
	
	

}
