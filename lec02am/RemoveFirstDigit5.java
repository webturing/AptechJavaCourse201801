package lec02am;

public class RemoveFirstDigit5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=1023;
		String s=Integer.toString(n);//better than (n+"") "1023"
		char[] cs=s.toCharArray();//{'1','0','2','3'};
		cs[0]='0';//{'0','0','2','3'};
		String t=new String(cs);//t="0023"
		int m=Integer.parseInt(t);//m=23
		System.out.println(m);
		

	}

}
