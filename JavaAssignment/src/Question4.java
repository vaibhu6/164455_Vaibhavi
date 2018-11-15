import java.util.Scanner;

package com.vaibhu;

public class Question4 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of 3 subjects");
		
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		
		if(sub1>60 && sub2>60 && sub2>60)
		{
			System.out.println("Passed");
		}
		else if(sub1<60 && sub2<60 && sub3<60)
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Promoted");
		}
	}
}
