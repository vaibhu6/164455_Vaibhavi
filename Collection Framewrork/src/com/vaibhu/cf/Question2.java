package com.vaibhu.cf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question2 {
	
		public static void main(String[] args) {
			HashSet<Integer> hash= new HashSet<Integer>();
			hash.add(20);
			hash.add(10);
			hash.add(40);
			hash.add(30);
			hash.add(50);
			hash.add(60);
			hash.add(70);
			
			System.out.println("Hashset elements");
			
			Iterator i=hash.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			
			System.out.println("\n");
		
			
			System.out.println("\n");
			LinkedHashSet<Integer> link= new LinkedHashSet<Integer>();
			link.add(20);
			link.add(10);
			link.add(50);
			link.add(60);
			link.add(40);
			link.add(30);
			link.add(70);
			
			System.out.println("LinkedHashset elements");
			Iterator i1=link.iterator();
			while(i1.hasNext())
				System.out.println(i1.next());
			
			
			
			
	}		
}

