package com.vaibhu;

public class Singleton {

	private static Singleton get_instance=null;
	
	private Singleton(){
		
	}
	
	private static Singleton get_instance(){
		System.out.println("\n Singleton get_instance  ");
		if(get_instance==null){
			System.out.println("Value of get_instance updated");
			get_instance= new Singleton();
		}
		return get_instance;
	}
	
	public static void main(String[] args) {
		Singleton singleton1=Singleton.get_instance()
		System.out.println(singleton1.hashCode());
		
		Singleton singleton2=Singleton.get_instance();	
		System.out.println(singleton1.hashCode());
		
		Singleton singleton3=Singleton.get_instance();
		System.out.println(singleton1.hashCode());
		
	}
}
