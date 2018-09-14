package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Object obj = ac.getBean("demoObj");
		
		DemoBean dobj = (DemoBean)obj;
		System.out.println(dobj.getMessage());
		((ConfigurableApplicationContext)ac).close();
		
		

	}

}
