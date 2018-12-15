package com.spring.question3.controller;

import com.spring.question3.service.BankAccountServiceImpl;

public class BankAccountcontroller {
	
	public BankAccountServiceImpl service;
	
	public BankAccountcontroller() {
	}
	
	public BankAccountServiceImpl getService() {
		return service;
	}
	public void setService(BankAccountServiceImpl service) {
		this.service = service;
	}
	public BankAccountcontroller(BankAccountServiceImpl service) {
		super();
		this.service = service;
	}
	public double withdraw(long accountId, double balance){
		return service.withdraw(accountId, balance);
		
	}
	public double deposit(long accountId, double balance){
		return service.deposit(accountId, balance);
		
	}
	public double getBalance(long accountId){
		return service.getBalance(accountId);
		
	}
	
}
