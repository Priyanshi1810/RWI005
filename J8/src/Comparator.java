import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<Integer> li=new ArrayList();
//li.add(1);
//li.add(2);
//li.add(5);
//li.add(7);
//li.add(3);
//Collections.sort(li,(a,b) ->b-a);
//System.out.println(li);

		  Set<Integer> s= new TreeSet<>();
	        s.add(1);
	        s.add(7);
	        s.add(3);
	      
	        System.out.println(" before maniual sorting" +s );
	        Set<Integer> ss= new TreeSet<>((a,b)-> b-a);
	        ss.add(22);
	        ss.add(37);
	        ss.add(40);
	        System.out.println("After maniual sorting desc: " +ss);
	}}