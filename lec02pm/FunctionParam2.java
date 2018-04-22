package lec02pm;

import java.util.Arrays;

public class FunctionParam2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={1,2,3};
		f(a);
		System.out.println(Arrays.toString(a));

	}

	private static void f(int[] a) {// a is Reference Type pass by Reference
		a[0]++;
		
	}


}
