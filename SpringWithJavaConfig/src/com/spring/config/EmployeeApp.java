package com.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext at = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee emp = at.getBean(Employee.class);
		System.out.println(emp.toString());
	}

}
