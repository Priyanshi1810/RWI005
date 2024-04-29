package multithretding;

public class TreadDemo extends  Thread{
	public void run() {
		System.out.println("this is thread");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreadDemo th=new TreadDemo();

th.start();

	}

}
