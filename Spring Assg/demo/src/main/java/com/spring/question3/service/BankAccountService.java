package com.spring.question3.service;

public interface BankAccountService {
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
}
