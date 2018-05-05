package contest1164;

public class G {
	static String hex2bin(char c) {
		String s = c + "";
		int i = Integer.parseInt(s, 16);
		String t = Integer.toBinaryString(i);
		while (t.length() < 4)
			t = "0" + t;
		return t;
	}

	public static void main(String[] args) {
		for(char c:"88D7".toCharArray())
			System.out.print(hex2bin(c));
		System.out.println();

	}
}
