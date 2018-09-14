package com.spring.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Object obj = ac.getBean("empObj");
		EmployeeBean emp = (EmployeeBean)obj;
		System.out.println(emp.getDepDetails());
		((ConfigurableApplicationContext)ac).close();
	}

}
