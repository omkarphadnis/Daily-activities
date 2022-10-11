//Multilevel:

//WAP to crate three class, one class implemet the prime no prcess , second class implement the swapping of two no, third class imepelment the find out the average of student marks.
package multilevel_inheritance;

import java.util.Scanner;

public class average_marks extends swapping
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		average_marks obj=new average_marks();
		obj.swap();
		obj.avg();
		
		

	}
	public void avg()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Total subject");
		n=sc.nextInt();
		System.out.println("Enter students marks");
		int arr[]=new int[n];
		System.out.println("enter the marks each subject");
		
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int total=0;
		for (int i=0;i<n;i++)
		{
			total=total+arr[i];
		}
		System.out.println("the average of total marks is"+total/n);

		
	}
	

}
