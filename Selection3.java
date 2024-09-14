/*if else ladder*/
import java.io.*;
class Selection3
{
	public static void main(String args[])
	{
		int percentage;
		DataInputStream d =new DataInputStream(System.in);
		try
		{
			System.out.println("enter your percentage ");
			percentage=Integer.parseInt(d.readLine());

			if(percentage>=60)
			{
				System.out.println("you passed with first division ");
			}
			else if(percentage>60 && percentage<=50)
			{
				System.out.println("you passed with second division");
			}
			else if(percentage>50 && percentage<=40)
			{
				System.out.println("you passesd with third division");
			}
			else
			{
				System.out.println("you are fail");
			}
		}
		catch(Exception f)
		{
			System.out.println("error occured ");
		}
	}
}
