package multilevel_inheritance;

import java.util.Scanner;

public class swapping extends prime_no 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void swap()
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println(" Before swapping Number 1 = "+ num1+"Number 2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println( "After swapping Number 1 = "+ num1+"Number 2 = "+num2);
		
		
	}

}
