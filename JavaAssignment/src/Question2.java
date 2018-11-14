
public class Question2 {
	public static void main(String[] args)
	{
		int number,copy;
		
		for(number=100;number<=999;number++)
		{
			int sum=0,remainder;
			copy=number;
			

			while(copy>0)
			{
				remainder=copy%10;
				sum+= remainder*remainder*remainder;
				copy=copy/10;
			}
			if(sum==number)
			{
				System.out.println(number);
				
			}
			
		}
		
		
	}
}
