package com.java8;

public class Greeting{
	
	public static void main(String[] args) {
		Greeter gre= () -> System.out.println("Hello World");
		gre.greet();
		Greeter a = () -> System.out.println("Without parameter");
		a.greet();
		ABC ab = (int b) -> b * 2;
		System.out.println(ab.greet(2));
		PQR abc = (int m,int n) -> m * n;
		System.out.println(abc.greet(2,6));
	}
}