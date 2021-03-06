package com.spring.question3.service;

import com.spring.question3.pogo.BankAccount;


public class BankAccountServiceImpl implements BankAccountService{

	private BankAccountepositoryImpl bankRepository;


	public BankAccountepositoryImpl getBankRepository() {
		return bankRepository;
	}

	public void setBankRepository(BankAccountepositoryImpl bankRepository) {
		this.bankRepository = bankRepository;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		double  newBalance=0;
		for(BankAccount bank:bankRepository.getAccount()){
			if(bank.getAccountId()==accountId){
				if(balance< bank.getAccountBalance())
				{
					newBalance= bank.getAccountBalance()-balance;
				}else{
					System.out.println("Not enough balance");
				}
			}
		}
		return newBalance;
	}

	@Override
	public double deposit(long accountId, double balance) {
		
		double  newBalance=0;
		for(BankAccount bank:bankRepository.getAccount()){
			if(bank.getAccountId()==accountId){
					newBalance= bank.getAccountBalance()+ balance;
			}
		}
		return newBalance;	
	}

	@Override
	public double getBalance(long accountId) {
		
		return bankRepository.getBalance(accountId);
	}

	

}
