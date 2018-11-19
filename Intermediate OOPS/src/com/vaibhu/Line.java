package com.vaibhu;
import java.util.Scanner;
public class Line extends Shape{
	
	@Override
	public void draw(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the x coordinates");
		int x1=scanner.nextInt();
		int x2=scanner.nextInt();
		System.out.println("Enter the y coordinates");
		int y1=scanner.nextInt();
		int y2=scanner.nextInt();
	System.out.println("Line drawn from ("+ x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");	
		
	}
	
}
