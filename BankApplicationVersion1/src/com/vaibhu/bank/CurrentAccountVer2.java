package com.vaibhu.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{
	@Override
	public String  getInsuranceName(){
		return "Health";
}
	@Override
	public double getInsuranceAmount(){
		return 100000;
	}
}
