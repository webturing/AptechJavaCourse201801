package week05P20;

public class P10ContestRank {
	public static int bool2Int(boolean bool) {
		return bool ? 1 : 0;
	}

	public static void main(String[] args) {
		for (int a = 1; a <= 3; a++)
			for (int b = 1; b <= 3; b++) {
				if (a == b)
					continue;
				int c = 6 - a - b;
				boolean ap = (b == 2 && c == 2), aq = (a == 1);
				boolean bp = (b <= 2), bq = (c == 3);
				boolean cp = (a != 2), cq = (b != 1);
				if (a + bool2Int(ap) + bool2Int(aq) == 3
				&&  b + bool2Int(bp) + bool2Int(bq) == 3
				&&  c + bool2Int(cp) + bool2Int(cq) == 3)
					System.out.println(String.format("%d %d %d", a, b, c));
			}
	}

}
