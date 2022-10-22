package com.example.demo;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public ArrayList<Employee> getDataFromDB()
	{
		Session session = sessionFactory.openSession();
		Criteria cri = session.createCriteria(Employee.class);
		ArrayList<Employee> e1 = (ArrayList<Employee>) cri.list();
		
		return e1;
		
	}

}
