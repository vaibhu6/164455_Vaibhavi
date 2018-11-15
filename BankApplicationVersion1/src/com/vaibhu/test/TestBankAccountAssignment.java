package com.vaibhu.test;

import com.vaibhu.bank.BankAccount;; 

public class TestBankAccountAssignment {

	public static void testBankAccountMethod()
	{
		BankAccount acc= new BankAccount();
		acc.setAccountHolderName("Sachin");
	}
	public static void main(String[] args)
	{
		testBankAccountMethod();
	}
}
