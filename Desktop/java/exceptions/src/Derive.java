import java.util.*;
import java.io.*;
class Base
 {
    Base() throws IOException 
    {
        throw new IOException();
    }
}

class Derive extends Base
{
    Derive() throws IOException
        { 
            super();
        }
        /* try 
          {

             super(); 
         } 
         catch (IOException e) 
            {
                System.out.println("We have exception from the ");
            }
        } */ 
     public static void main(String srgs[]) 
     { 
        try
        {
       Derive ob=new Derive(); 
      }
      catch(Exception e)
      {
          System.out.println("hey");
      }
}
}