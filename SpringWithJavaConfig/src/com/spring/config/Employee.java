package com.spring.config;

public class Employee {
	private String empName;
	private int empId;
	private int age;
	

	/**
	 * @param empName
	 * @param empId
	 * @param age
	 */
	public Employee(String empName, int empId, int age) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", age=" + age + "]";
	}	
	

}
