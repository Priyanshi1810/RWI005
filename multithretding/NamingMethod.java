package multithretding;

public class NamingMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
System.out.println(Thread.currentThread().getName());
Thread.currentThread().setName("priyanshi");
System.out.println("change name-"+Thread.currentThread().getName());
System.out.println(Thread.currentThread().isAlive());
	}

}
