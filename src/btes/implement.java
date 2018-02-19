package btes;
import btes2.checkValue;
import btes2.palindrome;
public class implement {

	public static void main(String[] args)
	{
		palindrome p= new palindrome();
		boolean x= p.checkString("ada");
		System.out.println("ada is palindrome ?"+x);
		boolean y=p.checkInt(343);
		System.out.println("343 is palindrome ?"+y);
		
		checkValue cv=new checkValue();
		boolean g= cv.checkString("adi is mad");
		System.out.println("adi is mad has spaces?"+g);
		boolean h=cv.checkInt(35780);
		System.out.println("35780 has a digit of zero?"+h);
	}
}
