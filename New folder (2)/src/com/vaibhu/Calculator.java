package com.vaibhu;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
	
		System.out.println("Enter your choice:\n 1. Add\n 2. Substract\n 3. Multiply\n 4.Division");
		int ch = scanner.nextInt();
		int result=0;
		switch(ch)
		{
		case 1: result = (num1 + num2);
				break;
		case 2: result = (num1 - num2);
				break;
		case 3: result = (num1 * num2);
				break;
		case 4: result = (num1 / num2);
				break;
		default:System.out.println("Wrong choice");
		}
		
		System.out.println(result);
	}
}
