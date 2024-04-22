package string;

public class Comparetoignore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="A";  
		String s2="a";
		
		
		String s3="A";  
		String s4="A";

		

		String s5="ab";  
		String s6="Ac";
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s3.compareToIgnoreCase(s4));
		System.out.println(s5.compareToIgnoreCase(s6));
	}

}
