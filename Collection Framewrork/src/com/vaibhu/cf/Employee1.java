package com.vaibhu.cf;

import java.util.Hashtable;

public class Employee1 {
	public static void main(String[] args) {
		Hashtable<Employee, Integer> hash= new Hashtable<>();
		 Employee e1 =new Employee(1,"Vaibhu");
		 hash.put(e1,1);
		 Employee e2 =new Employee(2,"Neha");
		 hash.put(e2,2);
		 Employee e3 =new Employee(3,"Kajal");
		 hash.put(e3,3);
		 Employee e4 =new Employee(4,"Sweta");
		 hash.put(e4,4);
		 
		 System.out.println(e1.hashCode());
		 System.out.println(e2.hashCode());
		 System.out.println(e3.hashCode());
		 System.out.println(e4.hashCode());
		 
		 System.out.println(hash.get(e1));
		 System.out.println(hash.get(e2));
		 System.out.println(hash.get(e3));
		 System.out.println(hash.get(e4));
		 
	}
}