package collectionfremwork;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack v= new Stack();
v.add(100);
v.add(50);
v.add(10);
v.add("priya");
v.add(2.30);
v.add(40);
v.add(null);
v.add(null);
v.add(10);
v.pop();
System.out.println(v);

System.out.println(v);
System.out.println(v.pop());
System.out.println(v);
System.out.println(v.pop());
System.out.println(v);
System.out.println(v.peek());
System.out.println(v.search("priya"));
System.out.println(v.empty());
}}
