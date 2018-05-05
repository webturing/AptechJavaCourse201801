package am;

public class CharArrayDemo {
	public static void main(String[] args) {
		String s="abcdefg";
		char[] cs=s.toCharArray();
		System.out.println(cs.toString());//ClassName+hashCode
		System.out.println(new String(cs));
	}

}
