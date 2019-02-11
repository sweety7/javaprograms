import java.util.*;
import java.io.*;
class FileWrite{
	public static void main(String args[])throws IOException
	{
		File f=new File("file.txt");
		BufferedWriter bout=new BufferedWriter(new FileWriter(f));
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		while(s.hasNext()){
			bout.write(s.nextLine());
			bout.newLine();
			}
			bout.close();
		}
}