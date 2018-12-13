package com.vaibhu.aop.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeServiceTest {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringDemo.xml");
	ShapeService service = context.getBean(ShapeService.class);
	System.out.println(service.getCircle().getName());

	}
}

