import java.io.*;
class Arithmetic
{
	public static void main(String args[])
	{
		int a,b;
		int add,sub,mult,div,rem;
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.println("enter value of a ");
			a=Integer.parseInt(d.readLine());

			System.out.println("enter value of b ");
			b=Integer.parseInt(d.readLine());

			add=a+b;
			sub=a-b;
			mult=a*b;
			div=a/b;
			rem=a%b;

			System.out.println("addition of "+a+" and "+b+" is "+add);


			System.out.println("subtraction of "+a+" and "+b+" is "+sub);


			System.out.println("multiplication of "+a+" and "+b+" is "+mult);


			System.out.println("division of "+a+" and "+b+" is "+div);


			System.out.println("remainder of "+a+" and "+b+" is "+rem);
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
	}
}