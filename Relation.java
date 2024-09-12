import java.io.*;
class Relation
{
	public static void main(String args[])
	{
		int a,b;
		boolean res;
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.println("enter value of a= ");
			a=Integer.parseInt(d.readLine());

			System.out.println("enter value of b= ");
			b=Integer.parseInt(d.readLine());

			res=a>b;
			System.out.println("is value of  "+a+" > "+b+" = "+res);

			res=a<b;
			System.out.println("is value of  "+a+" < "+b+" = "+res);

			res=a>=b;
			System.out.println("is value of  "+a+" >= "+b+" = "+res);

			res=a<=b;
			System.out.println("is value of  "+a+" <= "+b+" = "+res);

			res=a!=b;
			System.out.println("is value of  "+a+" != "+b+" = "+res);
		}
		catch(Exception e)
		{
			System.out.println("error occured ");
		}
	}
}
