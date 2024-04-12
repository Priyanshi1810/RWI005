package javaproject;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,5,6,7,8};
		int max=a[0];
		for(int i=1;i<a.length;i++){
		if (max>a[i]);
		  max=a[i];
		}
		System.out.print("maximum ele is"+max);
		}
	}

