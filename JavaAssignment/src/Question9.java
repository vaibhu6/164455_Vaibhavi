import java.util.Scanner;
package com.vaibhu;

public class Question9 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3 ;i++)
		{
			System.out.println("Enter the marks for 3 subjects");
			
			int subA=sc.nextInt();
			int subB=sc.nextInt();
			int subC=sc.nextInt();
			
			int total;
			float avg;
			
			total=subA +subB + subC;
			System.out.println("Total for " + i + " student:" + total);
			avg=total/3;
			System.out.println("Average for " + i + " student:" + avg);
		}
	}
	

}
