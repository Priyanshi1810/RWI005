package multithretding;

public class Main  extends Thread {
	public void run() {
		System.out.println("this is thread");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main m=new Main();

m.start();
Main m1=new Main();
m1.start();
	}

}
	