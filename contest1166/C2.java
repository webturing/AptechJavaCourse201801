package contest1166;

public class C2 {
	public static void main(String[] args) {
		String s = "I want an Accepted!";
		StringBuffer b = new StringBuffer(s);

		for (int i = 0; i < b.length(); i++) {
			if (Character.isUpperCase(b.charAt(i))) {
				b.setCharAt(i, Character.toLowerCase(b.charAt(i)));
			} else if (Character.isLowerCase(b.charAt(i))) {
				b.setCharAt(i, Character.toUpperCase(b.charAt(i)));
			}

		}
		//b.replace(2, 6, "DESIRE");
		//b.deleteCharAt(b.length() - 1);

		System.out.println(b.toString());
	}

}
