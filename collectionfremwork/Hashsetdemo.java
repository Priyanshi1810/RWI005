package collectionfremwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(500);
		al.add(100);
		al.add("priyanshi");
		al.add(2.30);
		al.add(400);
		
HashSet hs =new HashSet(al);
//hs.addAll(al);
hs.add(30);
hs.add(20);
hs.add(10);
hs.add(40.1);
hs.add("priya");
hs.add(null);
hs.remove("priyanshi");

System.out.println(hs);

Iterator itr= hs.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());

	}

}}
