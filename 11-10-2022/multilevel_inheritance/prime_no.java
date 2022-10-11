package multilevel_inheritance;

import java.util.Scanner;

public class prime_no 
{
	public void prime()
	{
		int num,count=0;
		Scanner sc=new Scanner(system.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(num+"is a prime number");
		else
		{
			System.out.println(num+"is not prime number");
		}
		
	}
	

}
