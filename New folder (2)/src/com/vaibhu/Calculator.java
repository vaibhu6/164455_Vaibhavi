package com.vaibhu;

import java.util.Scanner;

public class Calculator {

	public void calculate(){
		
		Scanner scanner =new Scanner(System.in);
		int n=1;
		while(n>0){
			System.out.println("Enter the numbers ");
			double num1 = scanner.nextInt();
			double num2 = scanner.nextInt();
	
			System.out.println("Enter your choice:\n 1. Add\n 2. Substract\n 3. Multiply\n 4. Division");
			int ch = scanner.nextInt();
			
			switch(ch){
				case 1: addition(num1,num2);
						break;
				case 2: subtract(num1,num2);
						break;
				case 3: multiplication(num1,num2);
						break;
				case 4: division(num1,num2);
						break;
				default:System.out.println("Wrong choice");
						return ;
			}
		
			
			 int cont;
			System.out.println("Do you want to continue?\n 1.Yes\n 2.No");
			cont=scanner.nextInt();
			if(cont==2)
				n--;	
			else if(cont!=1 && cont!=2 ){
				System.out.println("Wrong choice");
				n--;
			}
			
		}
	}

	public double addition(double num1,double num2){
		
		System.out.println(num1 + num2);
		return num1 + num2;
		
		}
	public double subtract(double num1,double num2){
		System.out.println(num1 - num2);
		return num1 - num2;
		}
	public double multiplication(double num1,double num2){
		System.out.println(num1 * num2);
		return num1 * num2;
		}
	public double division(double num1,double num2){
		System.out.println(num1 / num2);
		return num1 / num2;
		}
	
}