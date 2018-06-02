package week05P20;

public class PoorFunctionOverloadDemo {
	public static int ff(int a, int b) {
		return a + b;
	}
//
//	 public static double ff(int a,int b) {
//	 return 0;
//	 }
	public static double ff(double a, double b) {
		return a * b;

	}

	public static double ff(double a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		System.out.println(ff(3, 4));//7
		System.out.println(ff(3.0, 4));
		System.out.println(ff(3.0, 4.0));
		System.out.println(ff(3, 4.0));
	}
}
