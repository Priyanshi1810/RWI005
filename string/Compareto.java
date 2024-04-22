package string;

public class Compareto {

	public static void main(String[] args) {
		String s1="A";  //-//65
		String s2="a";//97
		
		
		String s3="A";  
		String s4="A";//0

		

		String s5="a";  //+
		String s6="A";
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s5.compareTo(s6));
	}
	}


