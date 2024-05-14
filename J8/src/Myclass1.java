interface A{
	default void sayhello() {
		System.out.println("a says hello");
	}
}
interface B{
	default void sayhello() {
		System.out.println("b says hello");
	}
}
public class Myclass1 implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass1 m =new Myclass1();
		m.sayhello();
	}

	@Override
	public void sayhello() {
		// TODO Auto-generated method stub
		A.super.sayhello();
	//	B.super.sayhello();
	}

	

}
