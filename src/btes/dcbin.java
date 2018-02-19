package btes;
import java.util.Scanner;

public class dcbin {
	
	public static void main(String[]args)
	{
		int [] rem=new int[64]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=0;
		while(num>0)
		{
		rem[i]=num%2;
		i++;
		num=num/2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(rem[j]);
		}
	}
}
