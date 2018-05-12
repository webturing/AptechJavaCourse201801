package p20;

import java.util.Arrays;

public class P09NumberSplitor {
	public static void main(String[] args) {
		String s = "A123X456Y7A,302ATB567BC,";
		String[] numbers = s.split("\\D+");
		System.out.println(Arrays.toString(numbers));
		int tot = 0;
		for (String number : numbers) {
			if (number.isEmpty())
				continue;
			System.out.println(number);
			++tot;
		}
		System.out.println(tot);
	}
}
