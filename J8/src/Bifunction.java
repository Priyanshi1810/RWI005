import java.util.function.BiFunction;
import java.util.function.Function;

public class Bifunction {
    public static void main(String[] args) {

        Function<String,Integer> myfunction = str -> str.length();
        System.out.println(myfunction.apply("priyanshi")); 

         

        BiFunction<String,String,Integer> mybifunction =(x,y)->x.length()+y.length();
        System.out.println(mybifunction.apply("shrishty"," tushar ")); 
    }
}



