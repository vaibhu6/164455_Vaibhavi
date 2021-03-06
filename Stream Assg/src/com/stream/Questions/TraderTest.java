package com.stream.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import com.stream.classes.Trader;

public class TraderTest {
	public static void main(String[] args) {
		ArrayList<Trader> trader= new ArrayList<Trader>();
		trader.add(new Trader("Vaibhavi","Mumbai"));
		trader.add(new Trader("Vinit","Mysore"));
		trader.add(new Trader("Abhay","Pune"));
		trader.add(new Trader("Jagadish","Bangalore"));
		trader.add(new Trader("Kajal","Indore"));
		trader.add(new Trader("Kajal","Pune"));
		trader.add(new Trader("Vaibhavi","Bangalore"));
		trader.add(new Trader("Vinit","Mumbai"));
		trader.add(new Trader("Abhay","Bangalore"));
		
		System.out.println("What are all the unique cities where the traders work?");
		 trader.stream()
		.map(x-> x.getCity()).distinct().
		forEach(x->System.out.println(x));
		 
		 System.out.println("------------------------------------------------------");
		 
		 System.out.println("Find all traders from Pune and sort them by name.");
		 
		 trader.stream()
		 	.filter(x->x.getCity()=="Pune")
		 	.sorted(Comparator.comparing(Trader::getName))
		 			.forEach(x-> System.out.println(x));
		 
		 System.out.println("------------------------------------------------------");

		System.out.println("Return a string of all traders’ names sorted alphabetically");
		
		trader.stream()
			.sorted(Comparator.comparing(Trader::getName))
			.forEach(x-> System.out.println(x.getName()));
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Are any traders based in Indore?");
		
		trader.stream()
			.filter(x->x.getCity()=="Indore")
			.forEach(x-> System.out.println(x.getName()));
		
		System.out.println("------------------------------------------------------");
	}
}
