import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int number=sc.nextInt();
		int b,mod, sum=0,count=0;
		b=number;
		int a=number;
		while(a>0)
		{
			a=a/10;
			count++;
		}
			
		while(number>0)
		{
			mod=number%10;
			sum+= Math.pow(mod,count);
			number=number/10;
		}
		
		if( sum == b )
		{
			System.out.println("Number is armstrong");
			
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		
		
	}
	
}
