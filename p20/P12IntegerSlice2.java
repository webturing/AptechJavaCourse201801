package p20;

//12***. ��������:   ����һ����Ȼ��n��
//���ǿ��Խ���ƽ����ȡ��������Ȼ����������Ȼ��135768��
//���Խ�ȡ��13,57,68������Ȼ�������ĳ��Ȼ������ƽ����ȡ(λ�����ܱ�3����)��
//�ɽ�����Ȼ����λ������ȡ���ֱ�̴Ӽ���������һ����Ȼ��N(N��λ��<12)��
//�����ȡ���һ�����ӵ����������ڶ������Ľ����   
public class P12IntegerSlice2 {

	public static void main(String[] args) {
		long n = 68L;
		String s = Long.toString(n);// s=n+"";
		while (s.length() % 3 != 0) {
			s = "0" + s;
		}
		int m = s.length();
		int w = m / 3;
		int head = Integer.parseInt(s.substring(0, w));
		int middle = Integer.parseInt(s.substring(w, 2 * w));
		int tail = Integer.parseInt(s.substring(2 * w));
		System.out.println(head + tail - middle);
	}

}
