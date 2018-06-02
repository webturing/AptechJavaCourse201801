package week05P20;

public class P04 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		better();
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	private static void poor() {// O(n^3)
		for (int x = 0; x <= N; x++)
			for (int y = 0; y <= N; y++)
				for (int z = 0; z <= N; z++) {
					if (x + y + z == N && 3 * x + 2 * y + z / 2 == N
							&& z % 2 == 0) {
						System.out.println(String.format("%d %d %d", x, y, z));
					}
				}

	}

	final static int N = 100000;

	private static void better() {// O(n^2/6)
		for (int x = 0; x <= N / 3; x++)
			for (int y = 0; y <= N / 2; y++) {
				int z = N - x - y;
				if (z % 2 == 0 && 3 * x + 2 * y + z / 2 == N) {
					System.out.println(String.format("%d %d %d", x, y, z));
				}
			}

	}
}
