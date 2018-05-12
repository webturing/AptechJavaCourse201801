package lec04am;
public class CaesarDeCode {
	public static void main(String[] args) {
		String s = "M pszi csy.";
		for (int k = 1; k < 26; k++) {			
			char[] cs = s.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				if (Character.isLowerCase(cs[i])) {
					cs[i] = (char) ('a' + ((cs[i] - 'a') + k) % 26);
				} else if (Character.isUpperCase(cs[i])) {
					cs[i] = (char) ('A' + ((cs[i] - 'A') + k) % 26);
				}
			}
			System.out.println(k+new String(cs));
		}

	}
}
