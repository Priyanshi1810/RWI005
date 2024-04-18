package abstractClass;


abstract class Animal{
	public abstract void sound();
	void eat() {};
}

class Dog extends Animal{
public void sound(){
	System.out.println("Dog is barking");
        }
}

class Lion extends Animal{
	public void sound(){
		System.out.println("Lion is Roar");
	}	
	public void eat() {
		System.out.println("lion is eating");
	}
}

public class Main {
	public static void main(String[] args) {
		// Animal animal = new Animal();// we can not create an object of abstract class
		Dog dog= new Dog();
		Lion lion=new Lion();
		dog.sound();
		lion.sound();
		
	}

}
