package contest1162;

import java.util.Scanner;

public class AFindMax {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String s = cin.next();
			char[] cs = s.toCharArray();
			char max = cs[0];
			for (int i = 0; i < cs.length; i++)
				if (cs[i] > max)
					max = cs[i];
			for (char c : cs) {
				System.out.print(c);
				if (c == max) {
					System.out.print("(max)");
				}
			}
			System.out.println();
		}
		cin.close();

	}

}
