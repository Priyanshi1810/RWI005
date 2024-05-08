package collectionfremwork;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListItrdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(10);
		l.add("priya");
		l.add(2,17);
		l.add(3,19);
		l.add(4,20);
		System.out.println(l);
		ListIterator li=l.listIterator();
		while (li.hasNext()) 
			System.out.println(li.next());
		
		//li.next();
		//li.next();
		//li.next();
		while (li.hasPrevious()) {
			System.out.println(li.previous());
	
		}
	}

	}
