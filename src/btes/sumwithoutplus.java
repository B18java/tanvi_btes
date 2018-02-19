package btes;
import java.util.Scanner;

public class sumwithoutplus {
	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 2 numbers to add");
		a=s.nextInt();
		b=s.nextInt();
		int sum=a-(-b);
		System.out.println("the sum is:"+sum);
		
	}

}
