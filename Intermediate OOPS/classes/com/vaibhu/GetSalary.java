package com.assignment2.Emp;
import java.util.Scanner;

public class GetSalary {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	//Manager sal object and incentives
	System.out.println("Enter the salary of Manager");
	int sal=scanner.nextInt();
	System.out.println("Enter the incentives of Manager");
	int incentives=scanner.nextInt(); 
	Manager manager=new Manager(sal,incentives);
	
	//Labour sal,object and overtime 
	System.out.println("Enter the salary of labour");
	int sal1=scanner.nextInt();
	System.out.println("Enter overtime of labour");
	int overtime=scanner.nextInt(); 
	Labour labour=new Labour(sal1,overtime);
	
	System.out.println("*******************************");
	System.out.println("\nThe total amount of the Manager is: " + manager.basesalary());
	System.out.println("\nThe total amount of the Labour is: " + labour.basesalary());
	System.out.println("*******************************");

		 }
}
