package contest1164;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		int[] freq = new int[26];
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine().toLowerCase();
			for (char c : line.toCharArray()) {
				if (Character.isLetter(c))
					freq[c - 'a']++;
			}
		}
		for(int i=0;i<26;i++)
			System.out.println(String.format("%c %d",'a'+i,freq[i]));
		cin.close();
	}
}
