package collectionfremwork;
import java.util.ArrayList;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 ArrayList al= new  ArrayList();
                 al.add(100);
                 al.add(300);
                 al.add(400);
                 al.add("priyanshi");
                 al.add('c');
                 System.out.println(al);
                 ArrayList al2= new  ArrayList();
                 al2.add("aaa");
                 al2.add("ggg");
                 al2.add("hhhh");
                
                 System.out.println(al2);
                 al.addAll(al2);
                 System.out.println(al);
	}

}
