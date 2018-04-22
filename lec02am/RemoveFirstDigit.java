package lec02am;

public class RemoveFirstDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=1023;
		String s=n+"";
		int len=s.length();
		int M=1;
		for(int i=1;i<len;i++)M*=10;
		System.out.println(M);
		System.out.println(n%M);

	}

}
