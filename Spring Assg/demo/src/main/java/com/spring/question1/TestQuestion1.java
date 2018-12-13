package com.spring.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestQuestion1 {
	public static void main(String[] args) {
		
	ApplicationContext context= new ClassPathXmlApplicationContext("Spring1.xml");
	Customer customer = (Customer) context.getBean("cust1");
	System.out.println(customer);

	}

}
