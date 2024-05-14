import java.util.function.Predicate;

public class predicates1 {
    public static void main(String[] args) {

    	 Predicate<Integer> salarygrethan120000predicates = x->x>120000;
         System.out.println( salarygrethan120000predicates.test(15954214));


}}
