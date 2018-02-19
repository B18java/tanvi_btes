package btes;

import java.util.Scanner;

public class prime {
	public static void main(String[] args)
	{
		int num,flag=1;
		System.out.println("enter the number to check prime or not");
		
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				flag=0;
				break;
			}
			else
				continue;
		}
		
		if(flag==1)
		{
			System.out.println("prime");
		}
		
		else
			System.out.println("not prime");
		
	}
}
