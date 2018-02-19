package btes;
import java.util.Scanner;

public class reverse {

		public static void main(String[] args)
		{
			int num,rem,rev=0;
			System.out.println("enter the number to find reverse");
			Scanner s= new Scanner(System.in);
			
			num=s.nextInt();
			
			while(num>0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			
			System.out.println("reverse of number is :"+rev);
			
		}
}
