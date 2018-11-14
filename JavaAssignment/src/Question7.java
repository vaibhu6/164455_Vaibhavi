import java.util.Scanner;
package com.vaibhu;

public class Question7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a[20],i search flag=0;
		
		for( i=0 ; i<15 ; i++)
		{
			a[i]=sc.nextInt();
		}
		for( i=0 ; i<15 ; i++)
		{
			if(search==a[i])
			{
				System.out.println("Element found");
				flag=1;
				break;
			}
		}
		
		if(flag==0
		{
			System.out.println("Element not found");
		}
		
		
		
		
	}
}
