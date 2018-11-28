package com.java8;

public class Test {
	public static void main(String[] args) {
		new Thread(new Runnable()
		{
			@Override
			public void run() {
			System.out.println("Thread Running");
			}
			
		}).start();
		
		new Thread (()-> 
		{System.out.println("Thread Running in java8");
		}).start();
	}
	
}
