package multithretding;

 class demo extends  Thread{
	public void run() {
		System.out.println("this is thread");
	}}
	class Main2 extends  Thread{
		public void run() {
			System.out.println("this is thread2");
		}}
	

	public class  Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 demo th=new demo ();

th.start();
Main2 h=new Main2();
h.start();
	}


	}

