package com.spring;

public class DemoBean implements IDemo {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void myInit() throws Exception{
		System.out.println("Init Method started...");
		if(msg.isEmpty() || null==msg)
			throw new Exception("Set Proper values to bean property");
	}
	public void destroy() {
		System.out.println("Destroy Method");
		msg = null;
	}

	@Override
	public String getMessage() {		
		return msg;
	}

}
