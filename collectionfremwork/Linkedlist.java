package collectionfremwork;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.add(7);
ll.add(5);
ll.add("tushar");
ll.add("tushar");
ll.add(7.8);
ll.add('p');
ll.add(null);
ll.add(null);
System.out.println(ll);
ll.addFirst("aaa");
ll.addLast("aaa");
System.out.println(ll);
ll.removeFirst();
ll.removeLast();
ll.add(8, "shubi");
ll.set(7, "u");
ll.remove();
System.out.println(ll);
ll.remove();//fifo
System.out.println(ll);
System.out.println(ll.contains("priya"));
	}

}
