import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Binary {
    public static void main(String[] args) {
        BiFunction<String, String, String> mybifunction = (str1, str2) -> str1 + str2;

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;

        System.out.println(binaryOperator.apply("hello", "priya")); 
    }
}



