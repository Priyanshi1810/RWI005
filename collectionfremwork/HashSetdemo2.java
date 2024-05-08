package collectionfremwork;

import java.util.HashSet;

public class HashSetdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs =new HashSet();
	
		hs.add(30);
		hs.add(20);
		hs.add(10);
		hs.add(40.1);
		hs.add("priya");
		hs.add(null);
		System.out.println(hs.contains(10));
		
hs.remove(null);
		System.out.println(hs);


	}

}
