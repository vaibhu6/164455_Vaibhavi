package com.vaibhu.cf;

public class Date {

	public int dd;
	public int mm;
	public int yyyy;
	
	public Date(int dd, int mm, int yyyy) {
		super(); 
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "Date [" + dd + ", " + mm + ", " + yyyy + "]";
		
	}
	public static void main(String[] args) {
		
		Date d1= new Date(06, 06, 1996);
		System.out.println(d1.toString());
	}

}
