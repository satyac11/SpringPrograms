package com.spring.model;

import java.util.Calendar;

public class DemoBean implements IDemo {
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String getWishMessage(String name) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		
		if(hour<=12)
			return msg+"-->Good Morning: "+name;
		else if(hour <=16)
			return msg+"-->Good Afternoon: "+name;
		else if(hour <=20)
			return msg+"-->Good Evening: "+name;
		else
			return msg+"-->Good Night: "+name;		
	}

	

}
