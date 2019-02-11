import java.util.*;
import java.io.*;
class FileDemo{
	public static void main(String args[]){

		try{  
			File f=new File("data.txt");
			BufferedWriter bout=new BufferedWriter(new FileWriter(f));
			Scanner s=new Scanner(System.in);
			boolean flag=true;
			while(flag)
			{
				System.out.println("enter serial no");
				bout.write(Integer.parseInt(s.nextInt()));
			}

		}

	}
}