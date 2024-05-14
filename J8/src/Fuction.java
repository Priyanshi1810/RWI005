import java.util.function.Function;

public class Fuction {
    public static void main(String[] args) {
        Function<Integer,Integer>function1 = x->2*x;
        Function<Integer,Integer> function2= x->x*x*x;
        System.out.println(function1.andThen(function2).apply(2)); 
        System.out.println(function2.andThen(function1).apply(3)); 
        System.out.println(function1.compose(function2).apply(4)); 

        Function<String,String> myidentity = Function.identity();
        System.out.println(myidentity.apply("tushar ") );  // jo  input mai denge wahi output mai aayega  
        
       
    }

}
