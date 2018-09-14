package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Object obj = ct.getBean("demObj");
		
		((ConfigurableApplicationContext)ct).close();
		DemoBean springBean = (DemoBean)obj;
		System.out.println("Result: "+springBean.getWishMessage("Satya"));

	}

}
