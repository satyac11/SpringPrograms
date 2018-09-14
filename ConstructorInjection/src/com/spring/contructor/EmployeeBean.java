package com.spring.contructor;

public class EmployeeBean {
	private int eid;
	private String empName;
	private float salary;
	private String designation;
	/**
	 * @param eid
	 * @param empName
	 * @param salary
	 * @param designation
	 */
	public EmployeeBean(int eid, String empName, float salary, String designation) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	

}
