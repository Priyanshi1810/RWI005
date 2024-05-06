package multithretding;

import java.io.File;
import java.io.IOException;

public class lile {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Priyanshi\\Desktop\\priya.txt");
		
		try {
			if(f.createNewFile()) {
				System.out.println("File Sucessfully Create");
				  
			}
			else {
				System.out.println("File Already exist..");
			}
			
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled..!");
		}
		

	}

	

}
		
	

		
