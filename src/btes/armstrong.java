package btes;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String[]args)
	{
		int num,rem,arm=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		int x=num;
		int y=num;
		armstrong a=new armstrong();
		while(num>0)
		{
			count++;
			num=num/10;
		}
		while(x!=0)
		{
			rem=x%10;
			arm=arm+a.power(rem,count);
			x=x/10;	
		}
		if(y==arm)
		{
			System.out.println("armstrong");
			
		}
		else
		{
			System.out.println("not armstrong");
			
		}
		
		
	}
	
	int power(int n,int m)
	{
		int x=1;
		for(int i=1;i<=m;i++) 
		{
			x=n*x;
		}
		return x;
	}

}
