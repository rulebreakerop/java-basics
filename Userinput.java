import java.io.*;
class Userinput
{
	public static void main(String args[])
	{
		int a,b,c;
		DataInputStream d=new DataInputStream(System.in);
		try
		{
			System.out.println("enter value of a= ");
			a=Integer.parseInt(d.readLine());

			System.out.println("enter value of b= ");
			b=Integer.parseInt(d.readLine());

			c=a+b;
			System.out.println(" addition of "+a+" and "+b+" is = "+c);
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
	}
}