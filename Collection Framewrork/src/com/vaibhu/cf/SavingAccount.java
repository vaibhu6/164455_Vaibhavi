package com.vaibhu.cf;

public class SavingAccount extends BankAccount{
@Override
	public String toString() {
		return "BankAccount accountNo=" + accountNo + ", accountHolderName="
			+ accountHolderName + ", accountBalance=" + accountBalance + "  isSalaryAccount=" + isSalaryAccount + "\n";
	}
private boolean isSalaryAccount;
public SavingAccount(){
this.isSalaryAccount=true;
}
public boolean issalaryAccount() {
	return this.isSalaryAccount;
}
public SavingAccount(int accno,String accountHolderName,double amount){
	super(accno, accountHolderName,amount);
	this.isSalaryAccount=true;
}
public SavingAccount(int accno,String accountHolderName,double amount,boolean isSalaryAccount){
	super(accno,accountHolderName,amount);
	this.isSalaryAccount=isSalaryAccount;
}
public void withdraw(double amount){
	this.accountBalance-=amount;
	
}
	
}

