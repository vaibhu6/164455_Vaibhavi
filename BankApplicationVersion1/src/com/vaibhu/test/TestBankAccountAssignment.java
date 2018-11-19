package com.vaibhu.test;

import com.vaibhu.bank.BankAccountAssignment; 
import com.vaibhu.bank.CurrentAccountVer2;
import com.vaibhu.bank.SavingAccount;
import com.vaibhu.bank.CurrentAccount;
import com.vaibhu.bank.SavingAccountVer2;

public class TestBankAccountAssignment {

	public static void testBankAccountMethod(){
		//BankAccountAssignment acc= new BankAccountAssignment();
		//acc.setAccountHolderName("Sachin");
	}
	public static void testSavingAccount(){
		SavingAccount savingAcc=new SavingAccount("vaibhu",5000);
		System.out.println("Account Holder Name is " + savingAcc.getAccountHolderName());
		System.out.println("Account No is "+ savingAcc.getAccountNo());
		System.out.println("Account Balance is "+ savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("Account Balance is "+ savingAcc.getAccountBalance());
		System.out.println("==========");
		savingAcc.withdraw(3000);
		System.out.println("Account Balance is "+ savingAcc.getAccountBalance());
	}
	public static void testCurrentAccount(){
		CurrentAccount currentAcc=new CurrentAccount("vaib",40000);
		System.out.println("\nAccount Holder Name is " + currentAcc.getAccountHolderName());
		System.out.println("Account No is "+ currentAcc.getAccountNo());
		System.out.println("Account Balance is "+ currentAcc.getAccountBalance());
		System.out.println("Account Balance is "+ currentAcc.getAccountBalance());
		System.out.println("==========");
		currentAcc.withdraw(50000);
		System.out.println("Account Balance is "+ currentAcc.getAccountBalance());
		System.out.println("OD Balance is "+ currentAcc.getodLimit());
	}

	public static BankAccountAssignment getBankAccount(String accountType){
		BankAccountAssignment acc=null;
		if(accountType.equals("Saving")){
			acc=new SavingAccount("Vaibhavi",4000);
		}
		else if(accountType.equals("Current")){
			acc=new CurrentAccount("Rahul",7000);
		}
		else{
			acc=null;
		}
		return acc;
	}
	
	public static void main(String[] args){
		//testSavingAccount();
		//testCurrentAccount();
		
		BankAccountAssignment acc=getBankAccount("Current");
		System.out.println("Account Name " + acc.getAccountHolderName());
		System.out.println("Account Balance " + acc.getAccountBalance());
		acc.withdraw(3000);
		System.out.println("Account Balance " + acc.getAccountBalance());
		
		SavingAccountVer2 acc1= new SavingAccountVer2();
		acc1.withdraw(400);
		acc1.deposit(4000);
		acc1.isSalaryAccount();
		acc1.getInsuranceName();
		
		CurrentAccountVer2 acc2= new CurrentAccountVer2();
		acc2.withdraw(400);
		acc2.deposit(4000);
		acc2.getInsuranceName();
	}
	
}
