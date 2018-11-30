package com.stream.Questions;

import java.awt.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.stream.classes.News;

public class NewsTest {
	public static void main(String[] args) {

		ArrayList<News> list = new ArrayList<News>();
		
		list.add(new News(11, "Vaibhavi ", "Kajal", "budget is too low"));
		list.add(new News(11, "Vaibhavi ", "Abhay", "Its good"));
		list.add(new News(11, "Vaibhavi ", "Neha", "Could have been better"));
		list.add(new News(11, "Vaibhavi ", "Sweta", "I didn't like it."));
		
		list.add(new News(12, "Kajal", "Vaibhavi", "budget is good"));
		list.add(new News(12, "Kajal", "Neha", "Average"));
		list.add(new News(12, "Kajal", "Vinit", "too bad"));
		list.add(new News(12, "Kajal", "Sweta", "Not up to the mark"));
		list.add(new News(12, "Kajal", "Jagadish", "Could have been better budget"));
		list.add(new News(12, "Kajal", "Deva", "I didn't like it."));
		
		list.add(new News(13, "Neha", "Vinit", "Average"));
		list.add(new News(13, "Neha", "Kajal", "Its good"));
		list.add(new News(13, "Neha", "Vaibhavi", "budget is too low"));
		list.add(new News(13, "Neha", "Deva", "I didn't like it."));
		list.add(new News(13, "Neha", "Sweta", "Could have been better"));
		
		list.add(new News(14, "Vinit", "Vaibhavi", "Could have been better"));
		list.add(new News(14, "Vinit", "Jagadish", "Average"));
		list.add(new News(14, "Vinit", "Deva", "budget is too high"));
		list.add(new News(14, "Vinit", "Deva", "I didn't like it."));
		list.add(new News(14, "Vinit", "Neha", "Its good"));
		
		System.out.println("Find out the newsId which has received maximum comments.");
		
		ArrayList<News> question1=(ArrayList<News>) list.stream()
					.collect(Collectors.toList());
		System.out.println(question1);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Find out how many times the word 'budget' arrived in user comments all news.");
		
		list.stream()
			.forEach(x-> System.out.println(x.getComment().contains("budget")));
		
		
		System.out.println("---------------------------------------------------------------------------------");
		
		list.stream().filter(x-> x.getComment().contains("budget")); 
	
		System.out.println("Find out which user has posted maximum comments.");
		
		//list.stream()
			//.filter(x->x.getNewsId()).count()
			//.forEach(x->System.out.println(x));
		
		System.out.println("---------------------------------------------------------------------------------");
		
	}
}
