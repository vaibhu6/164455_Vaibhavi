package com.vaibhu.cf;

import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ListIterator<Integer> listIterator=list.listIterator(list.size());
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
	}
}
