package com.spring.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring5.xml");
	Employee employee = (Employee) context.getBean("emp");
	System.out.println(employee);
	
	}
}
