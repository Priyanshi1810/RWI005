package multithretding;

public class Sleepmethod3  extends Thread {
	
	    public void run() {
	        try {
	            for(int i=1; i<=5; i++) { 
	                System.out.println(i + ":      " + Thread.currentThread().getName());
	                Thread.sleep(1000);
	            }
	        } catch(Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void main(String[] args) {
	    	Sleepmethod3   t1 = new Sleepmethod3 ();
	        t1.start();

	        Sleepmethod3 t2 = new Sleepmethod3();
	        t2.start();
	    }
	}

