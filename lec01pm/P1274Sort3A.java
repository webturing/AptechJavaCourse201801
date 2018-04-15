package lec01pm;

import java.util.Scanner;

public class P1274Sort3A {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		cin.close();
		// enumerator
		if (a <= b && b <= c) {
			System.out.println(String.format("%d %d %d", a, b, c));
		}
		else if (a <= c && c <= b) {
			System.out.println(String.format("%d %d %d", a, c, b));
		}
		else if (b <= a && a <= c) {
			System.out.println(String.format("%d %d %d", b, a, c));
		}
		else if (b <= c &&c <= a) {
			System.out.println(String.format("%d %d %d", b, c, a));
		}
		else if (c <= a && a <= b) {
			System.out.println(String.format("%d %d %d", c, a, b));
		}
		else {
			System.out.println(String.format("%d %d %d", c, b, a));
		}
	}
}
