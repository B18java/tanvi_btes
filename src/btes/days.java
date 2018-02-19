package btes;

import java.util.Scanner;

public class days {
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter days");
	int days=s.nextInt();
	int months=days/30;
	days=days%30;
	System.out.println(months+" months "+days+" days");
	}

}
