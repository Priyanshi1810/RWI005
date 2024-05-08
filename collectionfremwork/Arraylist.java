package collectionfremwork;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al= new ArrayList();
al.add(50);
al.add(10);
al.add("priya");
al.add(2.30);
al.add(40);
al.add(10);
al.add(null);
al.add(null);
//al.remove(3);
//al.clear();
//al.add(1, "p");

//System.out.println(al);
ArrayList al2= new ArrayList();
al2.add(70);
al2.add(80);
al2.add(90);
al2.add(null);
al2.set(0, "g");
al.addAll(al2);
//al.removeAll(al2);
System.out.println(al);
ArrayList al3= new ArrayList(al2);
System.out.println(al3);
	}

}
