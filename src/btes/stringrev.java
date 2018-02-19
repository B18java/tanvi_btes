 package btes;
import java.util.Scanner;

public class stringrev {
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
	String rev="";
	System.out.println("enter the string");
	String x= s.nextLine(); 
	int length = x.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+x.charAt(i);
		
	}
	System.out.println(rev);
	
}
}
