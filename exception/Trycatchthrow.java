package exception;

import java.util.Scanner;

// TODO Auto-generated method stub
		class  youngerage extends RuntimeException{
			youngerage(String age){
				super (age );
			}}

		public class Trycatchthrow {

			public static void main(String[] args)  {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter your age :");
				int age=sc.nextInt();
				try
				{
					if(age<18) {
						throw new Exception("you are not eligible");
					}
						else {
							System.out.println("you are eligible");
					}
				}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		
	}}


		