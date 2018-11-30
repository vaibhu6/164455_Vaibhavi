package com.lambda.six;

import java.util.ArrayList;

public class Replace {
	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("sanjay");
		list.add("ulka");
		list.add("vaibhavi");
		list.add("neha");
		
		list.replaceAll(s->(s.toUpperCase()));
		
		System.out.println(list);
	}
}
