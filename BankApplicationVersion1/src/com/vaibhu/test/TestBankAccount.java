package com.vaibhu.test;

import com.vaibhu.bank.BankAccount;; 

public class TestBankAccount {

	public static void testBankAccountMethod()
	{
		// main method is only used for executing, not for logic..
		BankAccount acc= new BankAccount();
		acc.setAccountHolderName("Sachin");
	}
	public static void main(String[] args)
	{
		testBankAccountMethod();
	}
}
