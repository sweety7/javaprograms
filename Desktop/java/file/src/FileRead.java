import java.util.*;
import java.io.*;
class FileRead{
	public static void main(String args[])throws IOException{
	File F=new File("file.txt");
    BufferedReader bin=new BufferedReader(new FileReader(F));
    String str;
    System.out.println("the content of file are:");
    while((str=bin.readLine())!=null)
    {
    	System.out.println(str);
 }
}
}