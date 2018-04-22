package lec02am;

import java.util.Scanner;

public class P1268ReverseMultiplier {
	private static int rev(int n) {//C-Style
		int ret = 0;
		while (n > 0) {
			int d = n % 10;
			ret = ret * 10 + d;
			n /= 10;
		}
		return ret;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int a=cin.nextInt();
			int b=cin.nextInt();
			int c=rev(rev(a)*rev(b));
			System.out.println(c);
		}
		cin.close();

	}

}
