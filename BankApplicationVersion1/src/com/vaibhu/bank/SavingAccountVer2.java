package com.vaibhu.bank;

public class SavingAccountVer2 extends SavingAccount implements Insurance{
	@Override
	public String  getInsuranceName(){
		return "JIVAN BHIMA";
}
	@Override
	public double getInsuranceAmount(){
		return 500000;
	}
	}
