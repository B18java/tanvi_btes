package btes;
import java.util.Scanner;

public class fibo {
	public static void main(String[] args)
	{
		
		int n,a=0,b=1,c;
		System.out.println("enter the series length");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
			
		
	}

}
