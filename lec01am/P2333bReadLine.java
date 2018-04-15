package lec01am;

import java.util.*;

public class P2333bReadLine {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();// "8,5"
		String[] ss = line.split(",");// {"8","5"}
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		int max = a;
		if (b > max) {
			max = b;
		}
		System.out.println(String.format("max=%d", max));
		cin.close();
	}
}