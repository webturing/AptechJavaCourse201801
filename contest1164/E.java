package contest1164;

public class E {
	public static void main(String[] args) {
		char c='x';
		System.out.println('a'<=c&&c<='z'||'A'<=c&&c<='Z');
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isLowerCase(c));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('A'));
		String s="I want an Accepted.";
		char[] cs=s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if(Character.isLowerCase(cs[i]))
				cs[i]=Character.toUpperCase(cs[i]);
			else if(Character.isUpperCase(cs[i]))
				cs[i]=Character.toLowerCase(cs[i]);
		}
		System.out.println(new String(cs));
	}
}
