import java.io.*;
import java.util.*;
class FileDemo
{
  public static void main(String args[])
  {
    try
    {
      File f=new File("data.txt");
        BufferedWriter bout=new BufferedWriter(new FileWriter(f));
      Scanner s = new Scanner(System.in);
             boolean flag=true;
           while(flag)
           {
            System.out.println("enter the serial n.");
            bout.write(Integer.toString(s.nextInt()));
            bout.write("  ");
            System.out.println("enter the name.");
            bout.write(s.next());
            bout.write("  ");
            System.out.println("enter the cgpa");
            bout.write(Float.toString(s.nextFloat()));
            bout.write("  ");
            System.out.println("enter the grade");
            bout.write(s.next().charAt(0));
            bout.write("  ");
           bout.newLine();
           System.out.println("Do you want to continue");
           char c;
           c=s.next().charAt(0);
           if(c=='N'|| c=='n')
            flag=false;
           
           }
           bout.write(s.nextLine());
    
    bout.close();

    BufferedReader bin=new BufferedReader(new FileReader(f));
    String str;
    String s;
    while((str=bin.readLine())!=null)
    {  if(str equals(s))
      System.out.println("the letter is present");
    }
  }
    catch(Exception e)
    {
      System.out.println(e);
    }

  }
}