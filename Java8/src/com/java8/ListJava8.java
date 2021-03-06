package com.java8;

import java.util.Collections; 
import java.util.Arrays;
import java.util.List;

public class ListJava8 {
	public static void main(String[] args) {
		
		List<Person> list =Arrays.asList(
			new Person("Vaibhavi","Awant",4),
			new Person("Neha","Patil",7)
			); 
		
	Collections.sort(list,(p1,p2)-> p1.getLastname().compareTo(p2.getLastname()));
	
		
		printConditionally(list,p->true);
		printConditionally(list, p-> p.getFirstname().startsWith("V")); 
		
	}

	private static void printConditionally(List<Person> list,Condition condition) {
		System.out.println();
		for(Person p:list){ 
			if(condition.test(p))
			System.out.println(p);
		}
		
	}
}
interface Condition{
	boolean test(Person p);
}