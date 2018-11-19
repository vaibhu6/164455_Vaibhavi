package com.vaibhu;

import java.util.Scanner;

public class Cube extends Shape {
	@Override
	public void draw(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length coordinates");
		int length=scanner.nextInt();
		
		System.out.println("Cube drawn with length " + length);	
		
	}
	
	
	
}
