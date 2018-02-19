package btes;

import java.util.Scanner;

public class Area {

	public static void main(String[]args)
	{
	Area a=new Area();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter side of square");
	int x=sc.nextInt();
	a.square(x);
	System.out.println("enter radius of circle");
	float y=sc.nextFloat();
	a.circle(y);

	}

	void square(int side)
	{
	int area=side*side;
	System.out.println("area of square is="+area);
	}
	void circle(float radius)
	{
	double area=3.14*radius*radius;
	System.out.println("area of circle is="+area);
	}
}
