import java.io.*;
class Selection2
{
	public static void main(String args[])
	{
		int a;
		DataInputStream d= new DataInputStream(System.in);
		try
		{
			System.out.println("enter value of a = ");
			a=Integer.parseInt(d.readLine());

			if(a%2==0)
			{
				System.out.println("entered number is even");
			}
			else
			{
				System.out.println("entered number is odd");
			}
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
	}
}