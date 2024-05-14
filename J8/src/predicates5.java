import java.util.function.Predicate;

public class predicates5 {

    public static void main(String[] args) {

        Predicate<String> startsWithLetterV = x-> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endsWithLetterL = x-> x.toLowerCase().charAt(x.length() -1) == 'a';
   Predicate<String> predicate= Predicate.isEqual("priyanshi");
        System.out.println(predicate.test("shristy"));
        System.out.println(predicate.test("priyanshi"));

//        Student S1 = new Student("priyanshi" , 1);
//        Student S2= new Student("tushar" , 2);
//        Predicate<Student> studentPredicate = x->x.getId()> 1;
//        System.out.println(studentPredicate.test(S2));
    }

    private static class Student {
        String name;
        int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;


}}}
