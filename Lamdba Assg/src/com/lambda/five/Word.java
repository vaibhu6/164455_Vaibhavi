package com.lambda.five;

import java.util.ArrayList;

class Word{
	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("Sanjay");
		list.add("Ulka");
		list.add("Vaibhavi");
		list.add("Neha");
		
		StringBuilder sb = new StringBuilder();		
			for(String p:list)
				sb.append(p.charAt(0));
	
			System.out.println(sb);
	}
}