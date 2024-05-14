interface S{
      static  void sayHellodear(){
        System.out.println("Hello ji");
    }
//    default void sayByedear(){
//        System.out.println("Bye bye dear");
//    }
}
public class Static1 implements S {
    public static void main(String[] args) {
        Static1 obj= new Static1();
 S.sayHellodear();
    }
}
