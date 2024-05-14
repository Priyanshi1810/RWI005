interface parent{
	default void sayhello() {
		System.out.println("hello");
	}
}
class child implements parent{
	public void sayhello() {
		parent.super.sayhello();
		System.out.println("child say hello");
	}
}
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//child c= new child();
parent c= new child();
c.sayhello();
	}

}
