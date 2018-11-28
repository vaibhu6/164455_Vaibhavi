package com.vaibhu.cf;

public abstract class BankAccount {
	
     protected int accountNo;
     protected String accountHolderName;
     protected double accountBalance;


public BankAccount(){ 
	
	accountHolderName="unknow";
	accountBalance= 0;
}
public BankAccount(int accno,String accountHolderName,double accountBalance){
	
	this.accountHolderName=accountHolderName;
	this.accountNo=accno;
	this.accountBalance= accountBalance;
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

public abstract void withdraw(double amount);



public void deposit(double amount){
	if(amount<=0){
		
		System.out.println("Enter valid amount");
	}
	else{
	this.accountBalance+=amount;
	}
}
@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "]";
}

}