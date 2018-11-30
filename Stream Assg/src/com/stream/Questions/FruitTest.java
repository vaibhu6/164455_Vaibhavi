package com.stream.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.stream.classes.Fruit;

public class FruitTest {
	public static void main(String[] args) {
		ArrayList<Fruit> fruit = new ArrayList<Fruit>();
		fruit.add(new Fruit("Mango",56,250,"Yellow"));
		fruit.add(new Fruit("Apple",75,150,"Red"));
		fruit.add(new Fruit("Strawberry",150,300,"Red"));
		fruit.add(new Fruit("Pineapple",85,200,"Yellow"));
		fruit.add(new Fruit("Watermelon",250,250,"Green"));
		fruit.add(new Fruit("Guava",90,100,"Green"));
		fruit.add(new Fruit("Banana",125,225,"Yellow"));
		fruit.add(new Fruit("Orange",110,115,"Orange"));
		fruit.add(new Fruit("Lichi",60,305,"White"));
		fruit.add(new Fruit("Grape",98,300,"Green"));
		
		//ArrayList<News> news= new AR
	
		System.out.println("Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories");
		
		List<Fruit> question1=fruit.stream()
				.filter(x -> x.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())  
				.collect(Collectors.toList());
		
		question1.forEach(x -> System.out.println(x.getName() + "         " + x.getCalories()));
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("Display color wise list of fruit names");
		
		List<Fruit> question2 = fruit.stream()
				.sorted(Comparator.comparing(Fruit::getColor)) 
				.collect(Collectors.toList());
		
		question2.forEach(x -> System.out.println(x.getName() + "                 " + x.getColor()));
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("Display only RED color fruits sorted as per their price in ascending order");
		
		List<Fruit> question3 = fruit.stream()
				.filter(x -> x.getColor()=="Red")
				.collect(Collectors.toList());
		
		question3.forEach(x -> System.out.println(x.getName() + "            " + x.getColor()));
		
				 
	}
	
}
