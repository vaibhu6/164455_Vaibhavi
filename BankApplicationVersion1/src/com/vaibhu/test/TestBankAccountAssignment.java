package com.vaibhu.test;

import com.vaibhu.bank.BankAccountAssignment; 
import com.vaibhu.bank.SavingAccount;
import com.vaibhu.bank.CurrentAccount;

public class TestBankAccountAssignment {

	public static void testBankAccountMethod()
	{
		//BankAccountAssignment acc= new BankAccountAssignment();
		//acc.setAccountHolderName("Sachin");
	}
	public static void testSavingAccount()
	{
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
	public static void testCurrentAccount()
	{
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
	public static void main(String[] args)
	{
		BankAccountAssignment acc= new BankAccountAssignment();
		acc.setAccountHolderName("Sachin");
		acc.testSavingAccount();
		acc.testCurrentAccount();
		testSavingAccount();
		testCurrentAccount();
	}
	
}
