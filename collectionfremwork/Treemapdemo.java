package collectionfremwork;

import java.util.TreeMap;

public class Treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap tp = new TreeMap();
tp.put(101, "priyanshi");
tp.put(102, "tushar");
tp.put(103, "aaru");
tp.put(100, "shristy");
tp.put(105, "aashi");
tp.put(106, "shewksha");
tp.put(107, "simu");

System.out.println(tp);
//System.out.println(tp.ceilingEntry(103));
//System.out.println(tp.ceilingEntry(104));
//System.out.println(tp.ceilingKey(106));
//tp.clear();
//System.out.println(tp);
//System.out.println(tp.containsValue("priyanshi"));
//System.out.println(tp.containsKey(900));
//System.out.println(tp.firstEntry());
//System.out.println(tp.floorKey(105));
//System.out.println(tp.get(103));
//System.out.println(tp.get(10));
//System.out.println(tp.headMap(102));
//System.out.println(tp.higherKey(105));
//System.out.println(tp.isEmpty());
//System.out.println(tp.keySet());
//System.out.println(tp.pollFirstEntry());
//System.out.println(tp.pollLastEntry());
//tp.remove(107);
//System.out.println(tp);
//tp.replace(107, "aaa");
//System.out.println(tp);
//System.out.println(tp.size());
System.out.println(tp.subMap(100, 105));
	}

}
