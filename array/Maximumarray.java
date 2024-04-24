package array;

public class Maximumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,5,6,7,23,56,90,35};
 int max=0;
 for(int i=0; i<a.length;i++) {
	 if(a[i]>max) {
		 max=a[i];
	 }
 }
 System.out.println("max is"+max);
	}

}
