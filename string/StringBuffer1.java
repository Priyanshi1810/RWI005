package string;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("priyanshi gupta");
		System.out.println(sb.capacity());
		sb.append(sb);
	}

}
