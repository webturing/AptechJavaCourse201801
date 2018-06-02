package week05P20;

import java.util.Arrays;

public class MathRandomDemo {
	static void testMathRandom() {
		int[] a = new int[10];
		int totalTimes = 1000;
		for (int i = 0; i < totalTimes; i++) {
			double cur = Math.random();
			a[(int) (cur * 10)]++;
		}
		System.out.println(Arrays.toString(a));
	}

	static int testCoin() {
		return (int) (2 * Math.random());
	}

	static double ff() {//Binomial distribution
		return Math.random() + Math.random();
	}

	static double gg() {//uniform distribution
		return Math.random() * 2;
	}

	/**
	 * gen uniform distribution in range[start,end]
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	static int doss(int start, int end) {
		return (int) ((end - start + 1) * Math.random() + start);
	}

	public static void main(String[] args) {
		testMathRandom();
		doss(0, 1);
		doss(1, 6);//
		doss(0, 52);
	}
}
