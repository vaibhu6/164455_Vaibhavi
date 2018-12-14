package com.spring.question3.service;

import java.util.List;

import com.spring.question3.pogo.BankAccount;


public class BankAccountepositoryImpl implements BankAccountRepository{

	List<BankAccount> account;
	
	@Override
	public double getBalance(long accountId) {
		double bal=0;
		for(BankAccount bank: account){
			if(bank.getAccountId()==accountId)
				bal=bank.getAccountBalance();
		}
		return bal;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		double bal=0;
		for(BankAccount bank: account){
			if(bank.getAccountId()==accountId){
				bank.setAccountBalance(newBalance);
				bal=getBalance(accountId);
			}
		}
		return bal;
	}

}
