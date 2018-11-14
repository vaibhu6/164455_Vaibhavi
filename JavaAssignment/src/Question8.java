import java.util.Scanner;

package com.vaibhu;

public class Question8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[10],i,j;
		
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		for( i=0 ; i<n ; i++ )
		{
			a[i]=sc.nextInt();
		}
		
		for( i=0 ; i <n-1 ;i++ )
		{
			for( j=0 ; j<n-i-1 ; j++ )
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for( i=0 ; i<n ; i++ )
		{
			System.out.println(a[i]);
		}
	}

}
