package btes;

public class prime_range {
	public static void main(String[] args)
	{
		int i,j;
		
		System.out.println("all prime numbers between 1 to 100");
		for(i=2;i<=100;i++)
		{int flag=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				
			}
		if(flag==1)
			System.out.println(i);
		else
			continue;
		}

	}

}
