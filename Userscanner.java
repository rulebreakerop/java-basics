import java.io.*;
import java.util.Scanner;
class Userscanner
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		try
		{
			System.out.println("enter value of a = ");
			a=obj.nextInt();

			System.out.println("enter value of b = ");
			b=obj.nextInt();

			c=a+b;
			System.out.println("addition of "+a+" and "+b+" is = "+c);
		}
		catch(Exception e)
		{
			System.out.println("error occured ");
		}
	}
}