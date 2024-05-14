import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myliststream = list.stream();
        System.out.println("List elements:-");
        myliststream.forEach(System.out::println); 
            System.out.println();

      
        String[] array = { "COWS", "LIONS", "BIRDS" };
        Stream<String> stream = Arrays.stream(array);
        System.out.println("Array elements:-");
        stream.forEach(System.out::println); 
        System.out.println();

        
        Stream<Integer> integerStreams = Stream.of(1, 2, 3);
        System.out.println("Integer stream:-");
        integerStreams.forEach(System.out::println); 
        System.out.println();

        
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(5);
        System.out.println("Iterated stream:-");
        limit.forEach(System.out::println); 
        System.out.println();

        
        Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);
        System.out.println("Generated stream:-");
        limit1.forEach(System.out::println);

        
        Stream<Integer> limit2 = Stream.generate(() -> (int)(Math.random() * 50)).limit(5);
        System.out.println("random integer generate:-");
        limit2.forEach(System.out::println); 
    }
}


