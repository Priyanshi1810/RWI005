package collectionfremwork;

import java.util.Enumeration;
import java.util.Vector;

public class Enucursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vector v = new Vector();
 v.add(10);
	v.add("priya");
	v.add(2,17);
	System.out.println(v);
	Enumeration e=v.elements();
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
	}

}
