package week05P20;

/**
 * #8.*** ѡ�ˡ�һ��С�鹲���ˣ��ֱ�ΪA��B��C��D��E������һ������Ҫ�����е�3����ȥ��ɡ� ��֪����1��A��C���ܶ�ȥ����2��B��C���ܶ���ȥ��
 * ��3�����Cȥ�ˣ�D��E��ֻ��ȥһ�����ұ���ȥһ���� ��4��B��C��D���ܶ�ȥ����5�����Bȥ�ˣ�D��E�Ͳ��ܶ�ȥ��
 * ����ҳ������������������ȥ��ɵ�������ϡ�
 * 
 * �Ӽ��ռ�2^n�ı���
 *
 */

public class P08 {
	static boolean imply(boolean p, boolean q) {
		return !p || q;
	}

	public static void main(String[] args) {
		for (int a = 0; a <= 1; a++)
			for (int b = 0; b <= 1; b++)
				for (int c = 0; c <= 1; c++)
					for (int d = 0; d <= 1; d++)
						for (int e = 0; e <= 1; e++) {
							boolean b0 = (a + b + c + d + e) == 3;// ��3����ȥ���
							boolean b1 = (a + c < 2);// ��1��A��C���ܶ�ȥ��
							boolean b2 = (b + c > 0);// ��2��B��C���ܶ���ȥ��
							boolean b3 = imply(c == 1, d + e == 1);// ��3�����Cȥ�ˣ�D��E��ֻ��ȥһ�����ұ���ȥһ����
							boolean b4 = (b + c + d < 3); // ��4��B��C��D���ܶ�ȥ
							boolean b5 = imply(b == 1, d + e < 2);// ��5�����Bȥ�ˣ�D��E�Ͳ��ܶ�ȥ��
							if (b0 && b1 && b2 && b3 && b4 && b5)
								System.out.println(String.format("%d%d%d%d%d",
										a, b, c, d, e));
						}

	}

}
