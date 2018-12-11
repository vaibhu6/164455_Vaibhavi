
package com.vaibhu.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.resource.Sample;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =new  ClassPathXmlApplicationContext("file:Spring.xml");
		
		Sample sample =(Sample) context.getBean("sam");
		sample.print("vaibhu");
	
	}
	
}
