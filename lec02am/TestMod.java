package lec02am;

public class TestMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((7+15)%7);
		//System.out.println((7+15)%0);
		System.out.println(2.0/0.0);//Nan  Inf
		System.out.println(-10%7);//bug
		System.out.println(-10.7%3.6);// 1.7ver ok
		System.out.println();
	}

}
