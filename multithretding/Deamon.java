package multithretding;

public class Deamon extends Thread
{
	public void run()
	{
		System.out.println("daemon");
	}
	public static void main(String[] arg) 
	{
		System.out.println("main thread");
		Deamon d=new Deamon();
		d.setDaemon(false);
		d.start();
		
	}
}
	
