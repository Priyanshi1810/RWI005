
public class Stati {
	   static
	    { 
	        System.out.println(" Static Block."); 
	    } 
	   {
		   System.out.println("Non-static Block");
	   }
	   
	   public static void main(String args[]) 
	    { 
		   Stati s = new Stati();
	        System.out.println(" main method."); 
	    } 
}
    