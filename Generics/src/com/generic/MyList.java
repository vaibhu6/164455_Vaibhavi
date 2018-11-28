package com.generic;

import java.util.ArrayList;

public class MyList<T>{

	ArrayList<T> list= new ArrayList<T>();

	public void add(T element){
		list.add(element);
	}
	public void remove(T element){
		list.remove(element);	
	}
	public void get(int i){
		list.get(i);
	}
	public void getAll(){
		System.out.println(list);
		
	}
	
}

