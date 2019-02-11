import java.util.Scanner;
class Exception1
{
	public static void main(String args[])
	{
	try{
	int x;
	x=50/0;
	}
	catch(ArithmeticException e){
	System.out.println("the exception is"+e);
	}
	try{
		int a[]=new int[10];
		a[20]=50;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("exception is"+e);
	}
	try
	{
		String s="sweety";
		int y=Integer.parseInt(s);

	}
	catch(NumberFormatException e)
	{
		System.out.println("exception is"+e);
	}
	try{
		String s=new String();
		Scanner s1=s1.next();
		if (s.equals("AB"))
			throw new IOException("no input");
	}
	catch(IOException e)
	{
		System.out.println("exception is"+e);
	}
	}
}