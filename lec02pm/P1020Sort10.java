package lec02pm;

import java.util.Arrays;
import java.util.Scanner;

public class P1020Sort10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = cin.nextInt();
		}
		// System.out.println(Arrays.toString(a));// debug
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		reverse(a);//
		//System.out.println(Arrays.toString(a));
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
		cin.close();

	}

	private static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
			//System.out.println(Arrays.toString(a));
		}

	}

}
