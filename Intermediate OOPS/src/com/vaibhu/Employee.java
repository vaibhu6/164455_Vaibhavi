package com.vaibhu;

public class Employee {
private static int autoEmployeeId;
	
	private int employeeId;
	private String employeeName;
	private int sal;
	
	{
		employeeId=++autoEmployeeId;
	}
	
	public Employee(){
		employeeName="Unknown";
		sal=0;
		System.out.println("Default constructor");
	}
	public Employee(String employeeName, int sal){
		this.employeeId=employeeId;
		this.sal=sal;
		System.out.println("Parameterize constructor");
	}
	public void setEmployeeName(String employeeName){
		this.employeeName=employeeName;
	}
	public int getsal(){
		return sal;
	}
	public String getemployeeName(){
		return employeeName;
	}	
	public int getemployeeId(){
		return employeeId;
	}

}
