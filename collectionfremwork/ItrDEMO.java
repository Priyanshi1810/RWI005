package collectionfremwork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ItrDEMO {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(10);
		l.add("priya");
		l.add(2,17);
		l.add(3,19);
		l.add(4,20);
		System.out.println(l);
		Iterator itr= l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
