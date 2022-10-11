package inheritance;
import java.util.Scanner;

public class single_inheritance extends fibonacci_demo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		single_inheritance obj=new single_inheritance();
		obj.fibo();
		obj.grether_no();

	}
	public void grether_no()
	{
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1> num2)
		{
			System.out.println("the grether number is"+ num1);
			
		}
		else
		{
			System.out.println("the grether number is"+num2);
		}
	}

}
