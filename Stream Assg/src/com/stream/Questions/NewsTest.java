package com.stream.Questions;

import java.awt.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.Map.Entry;
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
	
		Map<Object, Long> question4 = list.stream()
				.collect(Collectors.groupingBy(o -> o.getNewsId(),Collectors.counting()));
		System.out.println(question4);
		long max=0;
		int key=0;
		for(Entry<Object, Long> entry:question4.entrySet())
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				key= (int) entry.getKey();
			}
		}
		System.out.println("NewsId And Total Comments:\n"+question4); 			
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Find out how many times the word 'budget' arrived in user comments all news.");
		
		Long question5=list.stream()
				.filter(x-> x.getComment().contains("budget")).count();
		
		System.out.println(question5);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Find out which user has posted maximum comments.");
		

		Map<Object, Long> question6 = list.stream()
				.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
				System.out.println("Comment by user and no. of comments:\n"+question6);
				long maxNumber=0;
				Object keyValue=0;
				for(Entry<Object, Long> entry:question6.entrySet())
				{							
					if(entry.getValue()>maxNumber)
					{
						maxNumber=entry.getValue();
						keyValue= entry.getKey();
					}
				}
				System.out.println("User "+keyValue+" got max number of comments that is : "+maxNumber);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Display commentByUser wise number of comments");
		
		Map<Object,Long> question7= list.stream()
									.collect(Collectors.groupingBy(x->x.getCommentByUser(),Collectors.counting()));
		System.out.println(question7);
		
		System.out.println("----------------------------------------------------------------------------------");
		

		
	}
}
