
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>student=Arrays.asList("priyanshi"," tushar","shristy");
student.forEach(Main::print);
	}

}
