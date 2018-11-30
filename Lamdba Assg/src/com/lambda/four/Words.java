package com.lambda.four;

import java.util.*;

public class Words {
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hello");
		list.add("Vaibhu");
		list.add("Neha");
		list.add("Vinit");
		list.removeIf(n -> (n.length() % 2 == 0 ));
	
		for(String s : list){
			System.out.println(s);
		}
	
	}
}
