package com.assignment2.Emp;

public class Labour extends Employee {
	private int sal,overtime;

	public Labour(int sal, int overtime) {
		this.sal=sal;
		this.overtime=overtime;// TODO Auto-generated constructor stub
	}

	@Override
	public double basesalary() {
		// TODO Auto-generated method stub
		return (sal+overtime);
	}

	
}
