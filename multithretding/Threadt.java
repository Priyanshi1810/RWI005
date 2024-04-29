package multithretding;

public class Threadt implements Runnable 
{
	public void run()
	{
		System.out.println("this is thread class2");
	}
public static void main (String[]args) {
	Threadt t1=new Threadt();
	Thread th=new Thread(t1);
	
	
	th.start();
	
}
}
