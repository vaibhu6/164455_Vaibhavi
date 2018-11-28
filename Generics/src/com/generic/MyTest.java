package com.generic;

import java.util.Iterator;

class MyTest{

	public static void main(String[] args) {
		MyList<Integer> list= new MyList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.remove(4);
		
		list.get(2);
		list.getAll();
		
		MyList<String> list1= new MyList<String>();
		list1.add("AB");
		list1.add("BC");
		list1.add("CD");
		list1.add("DE");
		
		list1.remove("DE");
		
		list1.get(2);
		list1.getAll();
	}

}