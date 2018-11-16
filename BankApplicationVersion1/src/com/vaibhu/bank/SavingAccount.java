package com.vaibhu.bank;

public class SavingAccount extends BankAccountAssignment {

	private boolean isSalaryAccount;
	
	public SavingAccount(String accountHolderName,double amount){
		super(accountHolderName,amount);
		this.isSalaryAccount=true;
	}
	public SavingAccount(){
		this.isSalaryAccount=true;
	}
	public SavingAccount(String accountHolderName, double accountBalance, boolean isSalaryAccount){
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=isSalaryAccount;
	}	
	public boolean isSalaryAccount(){
		return isSalaryAccount;
	}
	
}
