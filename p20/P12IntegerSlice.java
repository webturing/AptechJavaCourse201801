package p20;

//12***. 截数问题:   任意一个自然数n，
//我们可以将其平均截取成三个自然数。例如自然数135768，
//可以截取成13,57,68三个自然数。如果某自然数不能平均截取(位数不能被3整除)，
//可将该自然数高位补零后截取。现编程从键盘上输入一个自然数N(N的位数<12)，
//计算截取后第一个数加第三个数减第二个数的结果。   
public class P12IntegerSlice {

	public static void main(String[] args) {
		long n = 68L;
		String s = "00" + Long.toString(n);// s=n+"";
		int m = s.length();
		int w = m / 3;
		int head = Integer.parseInt(s.substring(0, m - 2 * w));
		int middle = Integer.parseInt(s.substring(m - 2 * w, m - w));
		int tail = Integer.parseInt(s.substring(m - w));
		System.out.println(head + tail - middle);
	}

}
