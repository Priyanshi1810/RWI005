package collectionfremwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap  hm =new HashMap();//capacity 16 elements
hm.put(101, "tushar");
hm.put(102, "priyanshi");
hm.put(103, "shrishty");
hm.put(104, "aaru");
hm.put(null, "aaa");
hm.put(null, "bbb");
hm.put(105, null);
hm.put(106, null);

System.out.println(hm);
//System.out.println(hm.containsKey(101));
//System.out.println(hm.get(102));
//System.out.println(hm.get(107));
//System.out.println(hm.isEmpty());
System.out.println(hm.size());
hm.replace(105, "aashima");
hm.remove(103);
System.out.println(hm);

Set st=hm.entrySet();
System.out.println(st);
Iterator itr= st.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	Map.Entry entry=(Map.Entry) itr.next();
	System.out.println(entry.getKey()+"->"+entry.getValue());
	}

}}
