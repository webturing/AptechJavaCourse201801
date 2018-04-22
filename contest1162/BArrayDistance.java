package contest1162;

import java.util.Arrays;
import java.util.Scanner;

public class BArrayDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			int[] a = new int[m];
			int[] b = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = cin.nextInt();
			}
			for (int i = 0; i < b.length; i++) {
				b[i] = cin.nextInt();
			}
			// Arrays.sort(a);
			// Arrays.sort(b);
			// int[] D = { Math.abs(a[0] - b[0]), Math.abs(a[0] - b[n - 1]),
			// Math.abs(a[m - 1] - b[0]), Math.abs(a[m - 1] - b[n - 1]) };
			// Arrays.sort(D);
			// System.out.println(D[0]);
			int min = Math.abs(a[0] - b[0]);
			//int min=Integer.MAX_VALUE;
			//int max=Integer.MIN_VALUE;
			for (int x : a)
				for (int y : b) {
					int cur = Math.abs(x - y);
					if (cur < min)
						min = cur;
				}
			System.out.println(min);
		}
		cin.close();

	}

}
