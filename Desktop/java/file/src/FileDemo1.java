import java.io.*;
import java.util.*;
class FileDemo1
{
  public static void main(String args[])
  {
    File f=new File("data.txt");
      BufferedReader bin=new BufferedReader(new FileReader(f));
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string to search");
     String  str=s.next();
     String search;
     boolean flag=true;
     while(str=bin.readLine()!=null)
     { String str1[]=str.split(" ");
       for(i=0;i>str1.length;i++)
       	if(str1.equals(search))
       flag=false;
       else
       {	flag=true;
       	System.out.println("found");

    } }f.close();
}