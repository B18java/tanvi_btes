package btes;

import java.util.Scanner;

public class stringpalin {
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
	String rev="";
	System.out.println("enter the string");
	String x= s.next(); 
	int length = x.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+x.charAt(i);
		
	}
	
	if(x.equals(rev))
	System.out.println("palindrome");
	
	else
		System.out.println("not palindrome");

}
}