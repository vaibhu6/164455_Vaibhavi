package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShape {

	public static void main(String[] args) {
		
		//Triangle triangle= new Triangle();
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		
		ApplicationContext context =new  ClassPathXmlApplicationContext("file:spring.xml");
		
		Triangle triangle =(Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
