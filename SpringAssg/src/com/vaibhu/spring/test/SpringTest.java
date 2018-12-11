package com.vaibhu.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaibhu.spring.question1.Address;
import com.vaibhu.spring.question1.Customer;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Customer customer = (Customer) context.getBean(Customer.class);
		customer.print();
		
		
	}
}
