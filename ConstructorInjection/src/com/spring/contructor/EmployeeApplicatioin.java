package com.spring.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplicatioin {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Object obj = ct.getBean("empObj");
		EmployeeBean emp = (EmployeeBean)obj;
		System.out.println(emp.toString());
		((ConfigurableApplicationContext)ct).close();

	}

}
