package btes;
import java.util.Scanner;
public class length {
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("enter the number to find length");
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("number of digits are: "+count);
		
	}

}
