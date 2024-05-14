interface Employee{
	String getName();

	
}
	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=()->"software eng.";
		System.out.println(em.getName());
		Employee ed=()->"Editor";
		System.out.println(ed.getName());
	}}







