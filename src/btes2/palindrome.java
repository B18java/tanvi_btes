package btes2;

import java.util.Scanner;

public class palindrome implements Check
{
	int num;
	String z;
	public boolean checkString(String a)
	{
		String rev="";
		z=a;
		int length = z.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+z.charAt(i);
			
		}
		
		if(z.equals(rev))
		
		return true;
		
		else
			return false;
	}
	
	public boolean checkInt(int s)
	{
		int rem,rev=0;
		
		num=s;
		int z=num;
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(z==rev)
		{
			return true;
			
		}
		
		else
		{
			return false;
		}
	
		
	}
}