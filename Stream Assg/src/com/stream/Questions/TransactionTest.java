package com.stream.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.stream.classes.Fruit;
import com.stream.classes.Trader;
import com.stream.classes.Transaction;

public class TransactionTest {
	public static void main(String[] args) {
		ArrayList<Transaction> list = new ArrayList<Transaction>();
		list.add(new Transaction(new Trader("Vaibhavi","Delhi"), 2012, 15000));
		list.add(new Transaction(new Trader("Kajal","Bangalore"), 2014, 14000));
		list.add(new Transaction(new Trader("Abhay","Pune"), 2012, 9000));
		list.add(new Transaction(new Trader("Vinit","Mysore"), 2011, 13000));
		list.add(new Transaction(new Trader("Neha","Pune"), 2010, 16000));
		list.add(new Transaction(new Trader("Vaibhavi","Bangalore"), 2013, 11000));
		
		System.out.println("Find all transactions in the year 2011 and sort them by value (small to high).");
		
		List<Transaction> question8=list.stream()
			.filter(x-> x.getYear()==2012)
			.sorted(Comparator.comparing(Transaction::getValue)) 
			.collect(Collectors.toList());
		System.out.println(question8);
		
		
		System.out.println("--------------------------------------------------------------------");

		System.out.println("Print all transactions� values from the traders living in Delhi.");
		
		list.stream()
			.filter(x-> x.getTrader().getCity().equals("Delhi"))
			.forEach(x-> System.out.println(x));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("What�s the highest value of all the transactions?");
		
		Transaction obj=list.stream()
				.max(Comparator.comparing(Transaction::getValue)).get();
				System.out.println(obj);
				
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Find the transaction with the smallest value");

		Transaction obj1=list.stream()
				.min(Comparator.comparing(Transaction::getValue)).get();
				System.out.println(obj1);

		System.out.println("-------------------------------------------------------------------");

	}
}
