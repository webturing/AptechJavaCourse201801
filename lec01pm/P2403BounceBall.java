package lec01pm;

import java.util.Scanner;

public class P2403BounceBall {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		double H = 100;
		double s = -H;
		for (int i = 0; i < n; i++) {
			s += 2 * H;
			H /= 2;
		}
		System.out.println(String.format("%.4f %.4f", s, H));
		cin.close();
	}
}
