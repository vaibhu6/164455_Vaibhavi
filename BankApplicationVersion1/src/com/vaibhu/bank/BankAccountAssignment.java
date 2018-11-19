package com.vaibhu.bank; 

import java.io.ObjectInputStream.GetField;

public abstract class BankAccountAssignment {
	
	private static int autoAccountNo;
	
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	{
		accountNo=++autoAccountNo;
	
	}
	
	public BankAccountAssignment()	{
		accountHolderName="Unknown";
		accountBalance=0;
	
	}
	
	public BankAccountAssignment(String accountHolderName, double accountBalance){
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getAccountBalance() {
		return accountBalance; 
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void withdraw(double amount){
		if(amount<=0){
			System.out.println("Invalid amount entered");
		}
		else if ((this.accountBalance-amount)<1000){
			System.out.println("Invalid amount entered");
		}
		else if (amount>this.accountBalance){
			System.out.println("Invalid amount entered");
		}
		else {
		this.accountBalance-=amount;
		}
	}
	
	public void deposit(double amount){
		if(amount<=0){
			System.out.println("Invalid amount entered");
		}
		else{
			this.accountBalance+=amount;
		}
	}
	
	public static void main(String[] args){
		//BankAccountAssignment acc = new BankAccountAssignment();
		//BankAccountAssignment acc2 = new BankAccountAssignment("Vaibhavi",5000);
		//acc2.withdraw(4500);
		//double a=acc2.getAccountBalance();
		//System.out.println(a);
	}
}







