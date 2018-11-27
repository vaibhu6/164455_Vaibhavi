package com.vaibhu.cf;


public class Date {
	@Override
	public String toString() {
		return "Employee [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}

	private int dd;
	private int mm;
	private int yyyy;

	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}
	public int getMm() {
		return mm;
	}

	public int getYyyy() {
		return yyyy;
	}
}