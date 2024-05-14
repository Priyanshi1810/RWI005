
public class Class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable rn =()->{
	for(int i=1;i<=10;i++) {
		System.out.println("hello "+i);
	}
};
Thread childThread =new Thread(rn);
childThread.start();
	}

}
