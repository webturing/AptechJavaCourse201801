package lec05pm;

public class FunctionOverloadDemo {
	public static int ff(int a, int b) {
		return 0;
	}

	public static int ff(int a, int b, int c) {
		return 0;
	}

	public static void main(String[] args) {
		ff(1, 1);// line 4
		ff(1, 2, 3);// line 8
	}
}
