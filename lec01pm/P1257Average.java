package lec01pm;

import java.util.Scanner;

public class P1257Average {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		// double avg = (a + b + c) / 3;//ERROR
		double avg = (a + b + c) / 3.0;
		System.out.println(String.format("%.3f", avg));
		cin.close();
	}
}