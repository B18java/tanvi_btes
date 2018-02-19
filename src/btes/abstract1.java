package btes;
public class abstract1 {
	public static void main(String[] args)
	{
figure1 [] array1=new figure1[6];
array1[0]=new circle(4);
array1[0].findarea();
array1[0].findperimeter();
array1[1]=new circle(6);
array1[1].findarea();
array1[1].findperimeter();
array1[2]=new rectangle(3,6);
array1[2].findarea();
array1[2].findperimeter();
array1[3]=new rectangle(6,8);
array1[3].findarea();
array1[3].findperimeter();
array1[4]=new triangle(3,7,9);
array1[4].findarea();
array1[4].findperimeter();
array1[5]=new triangle(2,5,6);
array1[5].findarea();
array1[5].findperimeter();
System.out.println(array1[5].toString());
}
}

abstract class figure1{
	double dim1;
	
		abstract void findarea();
	abstract void findperimeter();
}
class circle extends figure1
{
	circle(int r)
	{
		
		dim1=r;
	}
	void findarea()
	{
		System.out.println("the area is"+(3.14*dim1*dim1));
	}
	void findperimeter()
	{
		System.out.println("the perimeter is"+(2*3.14*dim1));
	}
	
}
class rectangle extends figure1

{
	double dim2;
	rectangle(double l,double b)
	{
		dim1=l;
		dim2=b;
	}
	
void findarea()
{
	System.out.println("the area of rectangle is"+(dim1*dim2));
}

void findperimeter()
{
	System.out.println("the perimter of rectangle is"+(2*(dim1+dim2)));
	}
}

class triangle extends figure1{
	double dim2;
	double dim3;
	
	
	triangle(double side1,double side2,double side3)
	{
		dim1=side1;
		dim2=side2;
		dim3=side3;
	}
	
	void findarea()
	{double s,area;
	s=(dim1+dim2+dim3)/2;
	area=Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
	System.out.println("the area of triangle is"+area);
			
	}
	
	public String toString()
	{
		return "tanvi";
	}
	
	void findperimeter()
	{
	System.out.println("the perimeter of triangle is"+(dim1+dim2+dim3));	
		
	}
	
	
}
	
