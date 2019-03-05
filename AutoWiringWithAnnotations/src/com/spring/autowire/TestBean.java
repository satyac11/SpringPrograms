package com.spring.autowire;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TestBean implements ITest {
	
	private Date dt;
	

	public Date getDt() {
		return dt;
	}

	
	public void setDt(Date dt) {
		this.dt = dt;
	}
	@Autowired
	public TestBean(Date dt) {//Counstructor auto wiring
		this.dt = dt;
	}


	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Good Morning today date is: "+dt.toString();
	}

}
