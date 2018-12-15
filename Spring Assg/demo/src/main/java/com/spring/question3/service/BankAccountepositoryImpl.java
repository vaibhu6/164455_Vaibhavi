package com.spring.question3.service;

import java.util.List;

import com.spring.question3.pogo.BankAccount;


public class BankAccountepositoryImpl implements BankAccountRepository{

	private List<BankAccount> account;
	
	public List<BankAccount> getAccount() {
		return account;
	}


	public void setAccount(List<BankAccount> account) {
		this.account = account;
	}


	public BankAccountepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BankAccountepositoryImpl(List<BankAccount> account) {
		super();
		this.account = account;
	}


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
