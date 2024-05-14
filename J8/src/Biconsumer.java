
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Biconsumer {
    public static void main(String[] args) {

        Consumer<Integer> myconsumer= (x) -> {
            System.out.println(x);
        };
        myconsumer.accept(550); 

        BiConsumer<Integer,Integer> mybiConsumer = (x,y) -> {
            System.out.println(x+y);
        };
        mybiConsumer.accept(11,2); 
    }
}
