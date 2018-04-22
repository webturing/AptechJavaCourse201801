package lec02pm;

import java.util.Arrays;
import java.util.Scanner;

public class P1019Sort4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		//int[] a=new int[4];
		int[] a={cin.nextInt(),cin.nextInt(),cin.nextInt(),cin.nextInt()};
		//System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		System.out.print(a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		cin.close();

	}

}
