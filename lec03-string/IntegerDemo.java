public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Character.MAX_RADIX);
		System.out.println(Short.MAX_VALUE);// 2^15-1
		System.out.println(Integer.MAX_VALUE);// 2^31-1
		System.out.println(Long.MAX_VALUE);// 2^63-1
		int n = 1023;
		System.out.println(n + "");
		System.out.println(Integer.toString(n));
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toHexString(n).toUpperCase());
		System.out.println(Integer.toString(n << 2, 27));
		String s = "1011001";
		System.out.println(Integer.parseInt(s));
		System.out.println(Integer.parseInt(s, 2));
		System.out.println(Integer.parseInt(s, 8));
		System.out.println(Integer.parseInt(s, 16));

		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(Integer.parseInt("Ff", 16));
		
		System.out.println(Integer.toBinaryString(-1));
		for(int i=-10;i<10;i++)
			System.out.println(i+" "+~i);
		
		
	}
}
