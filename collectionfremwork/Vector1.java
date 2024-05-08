package collectionfremwork;
import java.util.Vector;
public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<Comparable> v = new  Vector<Comparable>();// intial cacpacity 10
		v.add(100);
		v.add(50);
		v.add(10);
		v.add("priya");
		v.add(2.30);
		v.add(40);
		v.add(null);
		v.add(null);
		v.add(10);
		v.add("priya");
		v.add(2.30);
		v.add(40);
		//v.removeAllElements();
		//v.removeElementAt(0);
		v.setElementAt("sss", 0);
		System.out.println(v);
		//System.out.println(v.removeElement(50));
		System.out.println(v.capacity());
	}

	
	}


