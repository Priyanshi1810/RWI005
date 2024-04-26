package exception;

import java.io.FileInputStream;

public class TrycatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis= new FileInputStream("d/txt");
}
catch (Exception e) {
	System.out.println(e);
}
System.out.println("hello");
	}

}
