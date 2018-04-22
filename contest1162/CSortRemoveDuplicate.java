package contest1162;

import java.util.Arrays;

public class CSortRemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 20, 40, 32, 67, 40, 20, 89, 300, 400, 15 };
		Arrays.sort(a);
		int[] b = new int[a.length]; //数组栈
		int j = 0;// j记录了多少元素被存储进入b
		System.out.println(Arrays.toString(b));
		b[j++] = a[0];
		System.out.println(Arrays.toString(b));
		for (int i = 1; i < a.length; i++) {
			if (a[i] != b[j - 1]) {
				b[j++] = a[i];
			}
		}
		System.out.println(j);
		System.out.println(Arrays.toString(b));

	}

}
