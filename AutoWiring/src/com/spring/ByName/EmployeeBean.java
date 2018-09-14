package com.spring.ByName;

public class EmployeeBean {
	private Department dp;

	public Department getDp() {
		return dp;
	}

	public void setDp(Department dp) {
		this.dp = dp;
	}
	
	public String getDepDetails() {
		StringBuilder msg =new StringBuilder();
		msg.append("DepartmentName is:"+dp.getDepName());
		msg.append(" and it has total :"+dp.getNoOfEmployees()+" employees");
		return msg.toString();
	}
}
