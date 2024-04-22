package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is book";  
	
		System.out.println(s1.replace("is", "was"));  
		System.out.println(s1.replaceAll("is", "was")); 
		System.out.println(s1.replaceFirst("is", "was")); 
		System.out.println(s1.replaceAll("is(.)","was")); 
		}
	}


