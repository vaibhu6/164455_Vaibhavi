package com.spring.question3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.question3.controller.BankAccountcontroller;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring3.xml");
		BankAccountcontroller controller = (BankAccountcontroller) context.getBean("controller");
		
		System.out.println("Balance of account 101 = " + controller.getBalance(101));
		controller.deposit(101,50000 );
		System.out.println("Balance of account 101 = " + controller.getBalance(101));
		controller.withdraw(102, 40000);
		System.out.println("Balance of account 102 = " + controller.getBalance(102));
	}
}
