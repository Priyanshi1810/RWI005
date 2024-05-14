


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Student {
	    public static void main(String[] args) {
	        Student1 s1 = new Student1(1,"priyanshi");
	        Student1 s2 = new Student1(2, "tushar");
	        Student1 s3 = new Student1(3, "shristy");
	        List<Student1> li = new ArrayList<Student1>();
	        li.add(s1);
	        li.add(s2);
	        li.add(s3);
	         Collections.sort(li, (a, b) -> b.id - a.id);
	        System.out.println(li);
	    }
	}

	class Student1 {
	    public Integer id;
	     public String name;

	    public Student1(Integer id, String name) {
	          this.id = id;
	        this.name = name;
	    }

	    public String toString() {
	                return this.id + ": " + this.name;
	    }
	}



	


