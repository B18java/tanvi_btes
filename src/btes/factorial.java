package btes;
import java.util.Scanner;


public class factorial {
	
	public static void main(String[] args)
	{
		int fac=1;
		System.out.println("enter the number to find fac");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		for(int i=num;i>0;i--)
		{
			fac=fac*i;
			}
		System.out.println("factorial is: "+fac);
	}

}
