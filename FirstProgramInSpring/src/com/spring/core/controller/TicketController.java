package com.spring.core.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Ticket;

public class TicketController {

	public static void main(String[] args) {
		ApplicationContext at = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Object obj = at.getBean("ticketObj");
		((ConfigurableApplicationContext)at).close();
		
		Ticket tickObj = (Ticket)obj;
		System.out.println(tickObj.toString());
		

	}

}
