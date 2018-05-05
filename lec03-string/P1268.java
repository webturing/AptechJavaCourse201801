package pm;

import java.util.Scanner;

public class P1268 {
	private static int rev(int n) {		
		return Integer.parseInt(new StringBuffer(Integer.toString(n)).reverse().toString());
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// /Ctrl+Shift + I O
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = rev(rev(a) * rev(b));
			System.out.println(c);
		}
		cin.close();
	}
}
