package com.spring.question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring9.xml");
		context.registerShutdownHook();
		LifeCycle lifecycle=(LifeCycle) context.getBean("cycle");
		lifecycle.getMessage();
	
		
		
		
	}
}
