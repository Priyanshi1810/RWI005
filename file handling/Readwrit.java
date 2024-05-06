package multithretding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Readwrit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			
			File f=new File("C:\\Users\\Priyanshi\\Desktop\\priyanshi.txt");
			FileWriter fw =new FileWriter(f);
			try {
				  fw.write(" my father name is Mukesh Gupta");
			}
			finally
			{
				fw.close();
			}
			System.out.println("Data wrote in files");
			}
			catch(IOException i){
				System.out.println(i);
			}
	}

}
