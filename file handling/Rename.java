package multithretding;

import java.io.File;

public class Rename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   File originalname=new File("C:\\Users\\Priyanshi\\Desktop\\priyanshi.txt");
	          File rename=new File("C:\\Users\\Priyanshi\\Desktop\\priyanshi1.txt");
	 if(originalname.exists()){
	     System.out.println(originalname.renameTo(rename)+" successfully changed name ");

	 }
	 else {
	     System.out.println("File doest not exits");
	 }

	}

}
