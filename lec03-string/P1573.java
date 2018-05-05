package pm;

import java.util.Scanner;

public class P1573 {
	static boolean isSys(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			String s = cin.next();
			while (isSys(s) && s.length() % 2 == 0) {
				s = s.substring(0, s.length() / 2);
			}
			System.out.println(s.length());
		}
		cin.close();
	}
}
