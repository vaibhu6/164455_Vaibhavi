package com.spring.question5;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	public int employeeId;
	public String employeeName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
		
	@Required
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + "]";
	}
}
