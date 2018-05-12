package p20;

import java.util.Scanner;

public class P09NumberSplitor2 {
	public static void main(String[] args) {
		String s = "A123X456Y7A,302ATB567BC,".replaceAll("\\D+", " ");
		Scanner cin = new Scanner(s);
		int tot = 0;
		while (cin.hasNext()) {
			int k = cin.nextInt();
			tot++;
			System.out.println(k);
		}
		System.out.println(tot);
		cin.close();
	}
}
