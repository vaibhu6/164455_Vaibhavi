package com.lambda.one;

public class Calculator {
	public static void main(String[] args) {
		
		Calculation add=(int a,int b) -> a + b ;
		System.out.println("Addition = " + add.cal(2,3));
		
		Calculation sub=(int a,int b) -> a - b ;
		System.out.println("Subtraction  = " + sub.cal(8,3));
		
		Calculation mul=(int a,int b) -> a * b ;
		System.out.println("Multiplication = " + mul.cal(2,3));
		
		Calculation div=(int a,int b) -> a / b ;
		System.out.println("Addition = " + div.cal(6,3));
		
	}
}
