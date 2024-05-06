package multithretding;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		   try (FileInputStream read = new FileInputStream("C:\\\\Users\\\\Priyanshi\\\\Desktop\\\\priyanshi1.txt");
		             FileOutputStream writecopy = new FileOutputStream("C:\\\\Users\\\\Priyanshi\\\\Desktop\\\\priya.txt")) {

		            int i;
		            while ((i = read.read()) != -1) {
		                writecopy.write(i);
		            }

		            System.out.println("Data copied successfully");
		        } catch (IOException e) {
		            System.out.println("Exception handled: " + e);
		        }
		    }
		    
	}


