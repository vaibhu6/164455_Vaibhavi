package com.lambda.one;

public class Calculator {
	public static void main(String[] args) {
		
		Addition ad=(int a,int b) -> a + b ;
		System.out.println("Addition = " + ad.add(2,3));
		
		Subtract su=(int a,int b) -> a - b ;
		System.out.println("Subtraction  = " + su.sub(8,3));
		
		Multiply mu=(int a,int b) -> a * b ;
		System.out.println("Multiplication = " + mu.mul(2,3));
		
		Divide di=(int a,int b) -> a / b ;
		System.out.println("Addition = " + di.div(6,3));
		
	}
}
