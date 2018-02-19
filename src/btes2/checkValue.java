package btes2;
import java.util.Scanner;

public class checkValue implements Check{

	public boolean checkString(String a)
	{
		String as;
		int i,c=0,flag=1;
		as=a;
for(i=0;i<as.length();i++)
{ 
		char ch=as.charAt(i);
		if(	ch==' ')

			{
			c++;
			flag=0;
			break;
			
			}
		
		}
if(flag==1)
	return false;
else
	return true;
	}
	
	
	public boolean checkInt(int n)
	{
		int num,rem,flag=0;
		num=n;
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
			{
				flag=1;
				break;
				}
			num=num/10;
		}
		if(flag==1)
			return true;
		else
			return false;
	}
}
