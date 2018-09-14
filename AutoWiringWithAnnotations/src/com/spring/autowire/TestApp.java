package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		TestBean beanObj = (TestBean)ac.getBean("testObj");
		System.out.println(beanObj.sayHello());
		((ConfigurableApplicationContext)ac).close();
	}

}
