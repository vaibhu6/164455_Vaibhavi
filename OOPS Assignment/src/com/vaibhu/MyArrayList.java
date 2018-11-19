package com.vaibhu;

import java.util.Scanner;

public abstract class MyArrayList implements MyList {
	
	Scanner scanner= new Scanner(System.in);
	int[] array = new int[10];
	int flag=0;
	
	for(int i=0; i<5; i++)
	{
		array[i]=scanner.nextInt();
	}
	for( i=0; i<5; i++)
	{
		System.out.println(array[i]);
	}
	
	int search=scanner.nextInt();
	
	for( i=0; i<5; i++)
	{
		if(search==array[i])
		{
			System.out.println("Element found");
			break;
			flag=1;
		}
	}

	if(flag==0)
	{
		System.out.println("Element not found");
	}
}
