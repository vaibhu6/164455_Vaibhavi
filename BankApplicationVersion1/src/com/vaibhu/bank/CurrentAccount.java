package com.vaibhu.bank;

public class CurrentAccount extends BankAccountAssignment {
	private double odLimit;
	
	public CurrentAccount(String accountHolderName, double amount){
		super(accountHolderName,amount);
		this.odLimit=20000;
	}
	public CurrentAccount(){
		this.odLimit=20000;
	}
	public double getodLimit(){
		return odLimit;
	}
	@Override
	public void withdraw(double amount){
	
		if((this.getAccountBalance()+this.odLimit)<amount){
			System.out.println("Overdraft limit reached");
		}
		else if (amount<=0){
			System.out.println("Invalid amount");
		}
		else if((this.getAccountBalance()-amount)<0){
			double Amountdraft=amount-this.getAccountBalance();
			this.accountBalance=0;
			this.odLimit-=Amountdraft;
		}
		else{
			this.accountBalance-=this.accountBalance;		
		}
	}
}
