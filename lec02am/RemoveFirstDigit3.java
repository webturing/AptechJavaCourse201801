package lec02am;

public class RemoveFirstDigit3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=1023;
		double x=Math.log10(n);//x=3.x
		int len=(int)(x)+1;	
		
		int M=1;
		for(int i=1;i<len;i++)M*=10;
		System.out.println(M);
		System.out.println(n%M);

	}

}
