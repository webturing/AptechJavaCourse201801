package lec01pm;

import java.util.Arrays;
import java.util.Scanner;

public class P1274Sort3D {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a[]={cin.nextInt(),cin.nextInt(),cin.nextInt()};
		Arrays.sort(a);
		System.out.println(String.format("%d %d %d", a[0], a[1], a[2]));
		cin.close();

	}
}
