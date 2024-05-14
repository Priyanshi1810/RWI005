import java.util.function.Predicate;

public class Predicates3 {
    public static void main(String[] args) {
       Predicate<String> startsWithLetterV = x-> x.toLowerCase().charAt(0) == 't';
        System.out.println(startsWithLetterV.test("tushar"));
    }
}



