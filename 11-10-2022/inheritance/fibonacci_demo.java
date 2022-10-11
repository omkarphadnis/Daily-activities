package inheritance;

public class fibonacci_demo {
	public void fibo()
	{
		int num1=0, num2=1,num3;
		System.out.println(num1+" "+num2);
		for(int i=2;i<=10;i++)
		{
			num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
