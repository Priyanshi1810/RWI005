import java.util.function.Predicate;

public class Predicates4 {
    public static void main(String[] args) {

        Predicate<String> startsWithLetterV = x-> x.toLowerCase().charAt(0) == 't';
        Predicate<String> endsWithLetterL = x-> x.toLowerCase().charAt(x.length() -1) == 'p';

        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("tushar"));

        Predicate<String> or = startsWithLetterV.or(endsWithLetterL);
        System.out.println(or.test("priyanshi"));

        System.out.println(startsWithLetterV.negate().test("tushar"));
    }
}


