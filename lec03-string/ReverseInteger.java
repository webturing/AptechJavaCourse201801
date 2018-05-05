package pm;

public class ReverseInteger {
	public static void main(String[] args) {// Unit Test
		System.out.println(0 == rev(0));//expectedValue==actualValue
		System.out.println(1 == rev(1));
		System.out.println(321 == rev(123));
		System.out.println(1 == rev(100000));
	}

	private static int rev(int n) {		
		return Integer.parseInt(new StringBuffer(Integer.toString(n)).reverse().toString());
	}

	private static int rev4(int n) {
		String s = Integer.toString(n);
		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		String t = buffer.toString();
		return Integer.parseInt(t);
	}

	/**
	 * 利用字符数组逆转
	 * 
	 * @param n
	 * @return
	 */
	private static int rev3(int n) {
		String s = Integer.toString(n);
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length / 2; i++) {
			char t = cs[i];
			cs[i] = cs[cs.length - 1 - i];
			cs[cs.length - 1 - i] = t;
		}
		return Integer.parseInt(new String(cs));
	}

	/**
	 * 利用整数 访问尾数n%radix 删除尾数 n/=radix
	 * 
	 * @param n
	 * @return
	 */
	private static int rev2(int n) {// n=123
		int t = 0;
		while (n > 0) {
			t = t * 10 + (n % 10);
			n /= 10;
		}
		return t;
	}

	/**
	 * 字符串反向连接
	 * 
	 * @param n
	 * @return
	 */
	private static int rev1(int n) {// n=123
		String s = Integer.toString(n);
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t += s.charAt(i);
		}
		// System.out.println(t);
		return Integer.parseInt(t);
	}

}
