package com.lambda.seven;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Function;

public class Map {
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("Hi ", "Vaibhu");
		hash.put("Hey ", "Neha");
		hash.put("Hello ", "Vinit");
		hash.put("Bye ", "Kajal");
		hash.put("GoodBye ", "Abhay");
		
		StringBuilder str =new StringBuilder();
		Function<Entry<String,String>, String> p= (i)-> i.getKey() + i.getValue();	
		for(Entry<String,String> i:hash.entrySet())
		{
			str.append(p.apply(i));
		}
		System.out.println(str);
		
		
	}
}
