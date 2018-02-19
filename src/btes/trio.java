package btes;

import java.util.Scanner;

public class trio {
	public static void main(String[] args)
	{
		
		int n,a=0,b=1,c=1,d;
		System.out.println("enter the series length");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for(int i=2;i<n;i++)
		{
			d=a+b+c;
			System.out.println(d);
			a=b;
			b=c;
			c=d;
		}
			
		
	}
}
