package com.spring.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testquestion2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		Question question= (Question) context.getBean("quest");
		System.out.println(question);
	}
}
