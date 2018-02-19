package btes;

import java.util.Scanner;

public class swap {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int temp;
	System.out.println("enter a and b");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("before swap--> a= "+a+" b= "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swap --> a= "+a+" b= "+b);
	}
}
