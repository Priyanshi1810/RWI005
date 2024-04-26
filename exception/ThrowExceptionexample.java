package exception;
class  youngerage extends RuntimeException{
	youngerage(String age){
		super (age );
	}}

public class ThrowExceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=24;
if(age<18) {
	throw new youngerage("you are not eligible");
	}
else {
	System.out.println("you are eligible");
}
}
	}


