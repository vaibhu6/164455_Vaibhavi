package com.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class ListJava7 {
	public static void main(String[] args) {
		
		List<Person> list =Arrays.asList(
			new Person("Vaibhavi","Sawant",4),
			new Person("Neha","Patil",7)
			); 
		
	Collections.sort(list, new Comparator<Person>()
			{
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getLastname().compareTo(p2.getLastname());
				}
	});
		printAll(list);
		
		printLastNameBeginningwithC(list);
			
	}


	private static void printLastNameBeginningwithC(List<Person> list) {
		for(Person p: list){
		if(p.getFirstname().startsWith("VD"))	
			System.out.println(p);
		}
	}

	private static void printAll(List<Person> list) {
		for(Person p: list)
			System.out.println(p);
		
	}
}