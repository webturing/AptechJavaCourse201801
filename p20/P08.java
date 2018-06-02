package week05P20;

/**
 * #8.*** 选人。一个小组共五人，分别为A、B、C、D、E。现有一项任务，要他们中的3个人去完成。 已知：（1）A、C不能都去；（2）B、C不能都不去；
 * （3）如果C去了，D、E就只能去一个，且必须去一个； （4）B、C、D不能都去；（5）如果B去了，D、E就不能都去。
 * 编程找出此项任务该由哪三人去完成的所有组合。
 * 
 * 子集空间2^n的遍历
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
							boolean b0 = (a + b + c + d + e) == 3;// 的3个人去完成
							boolean b1 = (a + c < 2);// （1）A、C不能都去；
							boolean b2 = (b + c > 0);// （2）B、C不能都不去；
							boolean b3 = imply(c == 1, d + e == 1);// （3）如果C去了，D、E就只能去一个，且必须去一个；
							boolean b4 = (b + c + d < 3); // （4）B、C、D不能都去
							boolean b5 = imply(b == 1, d + e < 2);// （5）如果B去了，D、E就不能都去。
							if (b0 && b1 && b2 && b3 && b4 && b5)
								System.out.println(String.format("%d%d%d%d%d",
										a, b, c, d, e));
						}

	}

}
