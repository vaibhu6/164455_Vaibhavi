package com.assignment2.Emp;

public class Manager extends Employee {
	private int sal,incentives;


	public Manager(int sal, int incentives) {
		this.sal=sal;
		this.incentives=incentives;
	}


	@Override
	public  double basesalary() {
		// TODO Auto-generated method stub
		return (sal+incentives);
	}


	
}
