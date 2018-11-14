import java.util.Scanner;

package com.vaibhu;

public class Question3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		float SI,CI,power;
		
		SI=(p*n*r)/100;
		
		System.out.println("Simple Interest=" + SI);
		
		System.out.println("Enter time for CI");
		
		int t= sc.nextInt();
		
		power=(float)Math.pow(1+r/n,n*t);
		
		CI=p*power;
		
		System.out.println("Compound Interest=" + CI);
	}

}