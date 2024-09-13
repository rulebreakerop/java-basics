import java.io.*;
class Selection
{
	public static void main(String args[])
	{
		int a,b;
		int var;
		DataInputStream d= new DataInputStream(System.in);
		try
		{
			System.out.println("enter value of a = ");
			a=Integer.parseInt(d.readLine());

			System.out.println("enter value of b = ");
			b=Integer.parseInt(d.readLine());

			if(b%2==0)
			{
				var=a/b;
				System.out.println("your output is = "+var);
			}
			System.out.println("end of the program");
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
	}
}