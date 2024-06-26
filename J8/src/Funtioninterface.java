import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Funtioninterface {
    public static void main(String[] args) {

        Function<String, Integer> FUNCTIONCHECK = x -> x.length();
        System.out.println(FUNCTIONCHECK.apply("priyanshi")); //check how may letters

        Function<String, String> FUNCTIONCHECK2 = s -> s.substring(0, 3);
        Function<List<Students>, List<Students>> studentWithVIPPriorityPrefix = li -> {
            List<Students> result = new ArrayList<>();

            for (Students s : li) {
                result.add(s);
            }

            return result;
        };

        Students s1 = new Students("priyanshi", 1);
        Students s2 = new Students("tusahr", 2);
        Students s3 = new Students("shristy", 3);
        List<Students> studentsFinal = Arrays.asList(s1, s2, s3);
        List<Students> allFilteredStudents = studentWithVIPPriorityPrefix.apply(studentsFinal);
        allFilteredStudents.forEach(student ->

                System.out.println("ID: " + student.getId()+ ",  Name: " + student.getName()

                ));
    }

    private static class Students {
        String name;
        int id;

        public Students(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

    }
}



