package com.vaibhu.cf;

import java.util.Comparator;

class Person {

	double weight;
	double height;
	String name;
	
	public Person(double weight, double height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name="
				+ name + "]";
	}
	
}
class Comparable implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2){
	if(p1.weight>p2.weight){
		return 1;
	}
	else if(p1.weight<p2.weight){
		return -1;
	}
	else if(p1.weight==p2.weight)
	{
		if(p1.height>p2.height){
			return 1;
		}
		else if(p1.height<p2.height){
			return -1;
		}
	}
	return 0;
}
}
	