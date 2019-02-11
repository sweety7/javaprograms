import java.util.Scanner;
class Exception2
{
	public static void main(String args[])
	{
		try{if(20>50)
			throw IllegalArgumentException("hi");}
		catch(IllegalArgumentException e)
		{
			System.out.println("the Exception is"+e);
		}
	}
}