import java.util.Scanner;
package com.vaibhu;

public class Question5 
{
	public static void main(Sring[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		long int CTC=sc.nextInt();
		long int Incometax;
		
		if(CTC>0 && CTC<180000 )
		{
			System.out.println("Slab A");
			System.out.println("Income tax: NIL");
		}
		else if(CTC>180001 && CTC<300000)
		{
			Incometax=0.1*CTC;
			System.out.println("Slab B");
			System.out.println("Income tax:" + Incometax);
		}
		else if(CTC>300001 && CTC<500000>)
		{
			Incometax=0.2*CTC;
			System.out.println("Slab C");
			System.out.println("Income tax:" + Incometax);
		}
		else
		{
			Incometax=0.3*CTC;
			System.out.println("Slab D");
			System.out.println("Income tax:" + Incometax);
		}
	}
}
