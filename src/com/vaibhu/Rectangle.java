package com.vaibhu;

import java.util.Scanner;

public class Rectangle extends Shape {
	@Override
	public void draw(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length ");
		int length=scanner.nextInt();
		System.out.println("Enter the breadth ");
		int breadth=scanner.nextInt();
		System.out.println("Rectangle drawn with length " + length + "and breadth " + breadth);	
		
	}
	
	
	
}
