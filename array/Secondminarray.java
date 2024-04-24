package array;

public class Secondminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,4,6,8,9,0};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			
		}
		System.out.println("2nd min is"+a[1]);
			}

		

	}


